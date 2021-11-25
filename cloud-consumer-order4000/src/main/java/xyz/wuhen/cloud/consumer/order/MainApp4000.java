package xyz.wuhen.cloud.consumer.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MainApp4000 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp4000.class,args);
    }
}
