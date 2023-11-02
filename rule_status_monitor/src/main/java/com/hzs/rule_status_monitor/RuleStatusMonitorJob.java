package com.hzs.rule_status_monitor;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RuleStatusMonitorJob implements Job {


    private final RuleStatusMonitor statusChecker;

    @Autowired
    public RuleStatusMonitorJob(RuleStatusMonitor statusChecker) {
        this.statusChecker = statusChecker;
    }

    @Override
    public void execute(JobExecutionContext context) {
        statusChecker.checkStatus(); // Implement this method to check the status of entities in the database
    }
}
