package com.spring.boot.tutorial.rabbitmq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


/**
 * @author cheny.huang
 * @date 2018-07-30 17:39.
 */
@SpringBootApplication(scanBasePackages = "com.spring.boot.tutorial.rabbitmq")
public class Application {
    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder().run(args);
    }
}
