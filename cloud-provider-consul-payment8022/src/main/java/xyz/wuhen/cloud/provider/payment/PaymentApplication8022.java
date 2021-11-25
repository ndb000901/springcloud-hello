package xyz.wuhen.cloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8022 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8022.class,args);
    }
}
