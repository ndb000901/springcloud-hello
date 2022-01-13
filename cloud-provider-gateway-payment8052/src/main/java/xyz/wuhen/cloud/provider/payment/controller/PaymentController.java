package xyz.wuhen.cloud.provider.payment.controller;


import cn.hutool.core.lang.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Value("${server.port}")
    String port;

    @GetMapping("/payment/info")
    public String paymentInfo() {
        return "port: " + port + "--->" + UUID.randomUUID();
    }
}
