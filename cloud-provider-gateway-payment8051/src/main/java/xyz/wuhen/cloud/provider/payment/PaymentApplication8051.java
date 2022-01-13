package xyz.wuhen.cloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication8051 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8051.class,args);
    }
}
