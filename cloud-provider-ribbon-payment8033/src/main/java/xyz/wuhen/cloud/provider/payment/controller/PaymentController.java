package xyz.wuhen.cloud.provider.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/ribbon")
    public String paymentRibbon() {
        return "springcloud with ribbon: "+ port +"\t"+ UUID.randomUUID().toString();
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return port;
    }

    @GetMapping(value = "/payment/openfeign/timeout")
    public String timeout() {
        System.out.println("timeout---->" + port);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }
}
