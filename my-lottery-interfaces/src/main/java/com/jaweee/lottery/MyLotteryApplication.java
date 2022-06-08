package com.jaweee.lottery;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: me
 * @title: MyLotteryApplication
 * @description:
 * @date: 2022/6/8 20:51
 */
@SpringBootApplication
@Configurable
@EnableDubbo
public class MyLotteryApplication {

    public static void main(String[] args){
        SpringApplication.run(MyLotteryApplication.class, args);
    }
}
