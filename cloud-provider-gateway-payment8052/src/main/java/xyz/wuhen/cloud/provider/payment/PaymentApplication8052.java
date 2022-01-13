package xyz.wuhen.cloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication8052 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8052.class,args);
    }
}
