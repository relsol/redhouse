package com.redhouse.common;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by RelSol.Chen on 2016/9/9.
 */
@Component
@Order(value = 2)
public class MyStartupRunner2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 2 <<<<<<<<<<<<<");
    }
}
