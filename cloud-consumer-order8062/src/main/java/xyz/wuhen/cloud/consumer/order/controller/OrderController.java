package xyz.wuhen.cloud.consumer.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xyz.wuhen.cloud.api.commons.entities.CommonResult;

@RestController
public class OrderController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    public static final String PaymentSrv_URL = "http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/consumer/payment")
    public String order() {
        return restTemplate.getForObject(PaymentSrv_URL + "/payment",String.class);
    }
}
