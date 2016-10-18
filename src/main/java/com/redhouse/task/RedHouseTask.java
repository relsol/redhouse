package com.redhouse.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by RelSol.Chen on 2016/9/8.
 */
@Configuration
@EnableScheduling
public class RedHouseTask {

//    @Scheduled(cron = "0/5 * * * * ?") // 每5秒执行一次
//    public void scheduler() {
//        System.out.println(">>>>>>>>> RedHouseTask.scheduler()");
//    }

}
