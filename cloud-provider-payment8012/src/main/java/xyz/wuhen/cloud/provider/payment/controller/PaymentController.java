package xyz.wuhen.cloud.provider.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private int port;

    @GetMapping("/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper: "+ port +"\t"+ UUID.randomUUID().toString();
    }
}
