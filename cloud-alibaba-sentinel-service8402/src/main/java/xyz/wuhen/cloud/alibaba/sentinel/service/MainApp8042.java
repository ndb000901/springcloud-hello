package xyz.wuhen.cloud.alibaba.sentinel.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8042 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8042.class,args);
    }
}
