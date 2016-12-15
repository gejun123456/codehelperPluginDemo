package com.codehelper;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;


/**
 * Created by bruce.ge on 2016/10/23.
 */
@RestController
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class App {
    @RequestMapping("/")
    String home() {
        return "hello world";
    }

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }


    @Bean(initMethod = "init")
    public DataSource dataSource() {
        DruidDataSource source = new DruidDataSource();
        source.setUsername("root");
        source.setPassword("");
        source.setUrl("jdbc:mysql://localhost/world?serverTimezone=GMT%2b8");
        return source;
    }

}
