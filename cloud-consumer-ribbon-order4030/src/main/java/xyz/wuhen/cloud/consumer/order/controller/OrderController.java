package xyz.wuhen.cloud.consumer.order.controller;

import com.netflix.loadbalancer.IRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private String service = "http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/consumer/payment/ribbon")
    public String payment() {
        return restTemplate.getForObject(service + "/payment/ribbon",String.class);
    }

}
