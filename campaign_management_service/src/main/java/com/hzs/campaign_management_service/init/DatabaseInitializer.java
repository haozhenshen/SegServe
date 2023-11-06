package com.hzs.campaign_management_service.init;

import com.hzs.campaign_management_service.model.*;
import com.hzs.campaign_management_service.repository.CampaignRepository;
import com.hzs.campaign_management_service.repository.RuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseInitializer implements CommandLineRunner {


    private final CampaignRepository campaignRepository;


    private final RuleRepository ruleRepository;

    @Autowired
    public DatabaseInitializer(CampaignRepository campaignRepository, RuleRepository ruleRepository) {
        this.campaignRepository = campaignRepository;
        this.ruleRepository = ruleRepository;
    }

    @Override
    public void run(String... args) {
        // Generate and save multiple sample data entries
        List<CampaignDAO> campaignDAOList = generateSampleCampaigns();
        List<RuleDAO> ruleDAOList = generateSampleRules();

        campaignRepository.saveAll(campaignDAOList);
        ruleRepository.saveAll(ruleDAOList);
    }

    private List<CampaignDAO> generateSampleCampaigns() {
        List<CampaignDAO> campaignDAOList = new ArrayList<>();

        campaignDAOList.add(createCampaign("campaign1", "Sample Campaign 1", "rule1"));
        campaignDAOList.add(createCampaign("campaign2", "Sample Campaign 2", "rule2"));
        campaignDAOList.add(createCampaign("campaign3", "Sample Campaign 3", "rule3"));

        return campaignDAOList;
    }

    private List<RuleDAO> generateSampleRules() {
        List<RuleDAO> ruleDAOList = new ArrayList<>();

        ruleDAOList.add(createRule("rule1", "Sample Rule 1"));
        ruleDAOList.add(createRule("rule2", "Sample Rule 2"));
        ruleDAOList.add(createRule("rule3", "Sample Rule 3"));

        return ruleDAOList;
    }

    private CampaignDAO createCampaign(String campaignId, String campaignName, String ruleId) {
        Campaign campaign = Campaign.newBuilder()
                .setCampaignId(campaignId)
                .setCampaignName(campaignName)
                .setRuleId(ruleId)
                .setSchedule(
                        Schedule.newBuilder()
                                .setCronExpression("*/5 * * * *")
                                .setTimeZone("UTC")
                                .setJobDescription("Sample Job")
                                .build()
                )
//                .addTarget(
//                        Target.newBuilder()
//                                .setHomePage(
//                                        HomePageShelfTarget.newBuilder()
//                                                .setShelfId("sampleShelfId")
//                                                .build()
//                                )
//                                .build()
//                )
                .build();

        return new CampaignDAO(campaign);
    }

    private RuleDAO createRule(String ruleId, String ruleName) {
        Rule rule = Rule.newBuilder()
                .setRuleId(ruleId)
                .setRuleName(ruleName)
//                .setPlayActivityRule(
//                        PlayActivityRule.newBuilder()
//                                .setContentId("sampleContentId")
//                                .setProgress(50)
//                                .build()
//                )
                .build();

        return new RuleDAO(rule);
    }
}