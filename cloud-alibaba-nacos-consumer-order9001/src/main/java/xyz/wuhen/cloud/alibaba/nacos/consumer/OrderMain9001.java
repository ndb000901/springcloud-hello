package xyz.wuhen.cloud.alibaba.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain9001.class,args);
    }
}
