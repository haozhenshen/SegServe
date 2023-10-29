package com.hzs.user_update_daemon;
import com.hzs.user_update_daemon.proto.RuleUpdate;
import com.hzs.user_update_daemon.proto.UserRangeRuleUpdate;
import com.hzs.user_update_daemon.proto.UserRuleUpdate;
import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;



@Component
public class KafkaConsumer {

    @Value("${myapp.totalUsers}")
    private int totalUsers;

    @Value("${myapp.numPartitions}")
    private int numPartitions;

    @Value("${io.user-range-update.kafka.topic}")
    private String USER_RULE_UPDATE_TOPIC;
    private final KafkaProducer kafkaProducer;

    private final Environment env;

    @Autowired
    public KafkaConsumer(KafkaProducer kafkaProducer, Environment env) {
        this.kafkaProducer = kafkaProducer;
        this.env = env;
    }



    @org.springframework.kafka.annotation.KafkaListener(
            topics = "${io.rule-update.kafka.topic}", // Listen to the RuleUpdate topic
            groupId = "${spring.kafka.consumer.group-id}",
            containerFactory = "kafkaListenerContainerFactory")
    public void listenRuleUpdate(@Payload byte[] message) throws InvalidProtocolBufferException {
        RuleUpdate ruleUpdate = RuleUpdate.parseFrom(message);

        // Your logic to process the RuleUpdate message goes here
        System.out.println("Received RuleUpdate message: " + ruleUpdate.toString());

        int messagesPerPartition = totalUsers / numPartitions;
        System.out.println("message per partition is: " + messagesPerPartition);
        // Generate and send 10 UserRangeRuleUpdate messages
        for (int partition = 0; partition < numPartitions; partition++) {

            UserRangeRuleUpdate userRangeUpdate = createSomeUserRangeUpdate(ruleUpdate, partition, messagesPerPartition);
            kafkaProducer.sendProtobufMessage(env.getProperty("io.user-range-update.kafka.topic"),null, userRangeUpdate);

        }
    }

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "${io.user-range-update.kafka.topic}", // Listen to the UserRangeRuleUpdate topic
            groupId = "${spring.kafka.consumer.group-id}",
            containerFactory = "kafkaListenerContainerFactory")
    public void listenUserRangeUpdate(@Payload byte[] message) throws InvalidProtocolBufferException {
        UserRangeRuleUpdate userRangeUpdate = UserRangeRuleUpdate.parseFrom(message);

        // Your logic to process the UserRangeRuleUpdate message goes here
        System.out.println("Received UserRangeRuleUpdate message: " + userRangeUpdate.toString());

        // Generate and send 10 UserRuleUpdate messages for each UserRangeRuleUpdate
        for (int i = userRangeUpdate.getMinUserId(); i < userRangeUpdate.getMaxUserId(); i++) {
            UserRuleUpdate userRuleUpdate = createSomeUserRuleUpdate(userRangeUpdate, i); // Create UserRuleUpdate
            kafkaProducer.sendProtobufMessage("UserUpdate", null, userRuleUpdate); // Send to UserRuleUpdate topic
        }
    }

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "${io.user-update.kafka.topic}", // Listen to the UserRangeRuleUpdate topic
            groupId = "${spring.kafka.consumer.group-id}",
            containerFactory = "kafkaListenerContainerFactory")
    public void listenUserUpdate(@Payload byte[] message) throws InvalidProtocolBufferException {
        UserRuleUpdate userRangeUpdate = UserRuleUpdate.parseFrom(message);

        // Your logic to process the UserRangeRuleUpdate message goes here
        System.out.println("Received UserRuleUpdate message: " + userRangeUpdate.toString());

    }
    // Implement methods to create UserRangeRuleUpdate and UserRuleUpdate messages as needed
    private UserRangeRuleUpdate createSomeUserRangeUpdate(RuleUpdate ruleUpdate, int partition, int messagesPerPartition) {
        UserRangeRuleUpdate.Builder builder = UserRangeRuleUpdate.newBuilder()
                .setRuleId(ruleUpdate.getRuleId())
                .setRuleName(ruleUpdate.getRuleName())
                .setRuleVersion(ruleUpdate.getRuleVersion());

        int minUserId = partition * messagesPerPartition;
        int maxUserId = (partition + 1) * messagesPerPartition;

        // Set the calculated min_user_id and max_user_id
        builder.setMinUserId(minUserId);
        builder.setMaxUserId(maxUserId);

        return builder.build();
    }

    private UserRuleUpdate createSomeUserRuleUpdate(UserRangeRuleUpdate userRangeUpdate, int userId) {
        UserRuleUpdate.Builder builder = UserRuleUpdate.newBuilder()
                .setUserId(userId) // Use min_user_id as user_id
                .setRuleId(userRangeUpdate.getRuleId())
                .setRuleName(userRangeUpdate.getRuleName())
                .setRuleVersion(userRangeUpdate.getRuleVersion());

        return builder.build();
    }
}
