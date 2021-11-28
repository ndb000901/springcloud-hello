package xyz.wuhen.cloud.consumer.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import xyz.wuhen.cloud.order.myrule.MyRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MyRule.class)
public class MainApp4030 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp4030.class,args);

    }
}
