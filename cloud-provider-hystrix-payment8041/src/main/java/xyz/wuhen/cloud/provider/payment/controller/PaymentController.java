package xyz.wuhen.cloud.provider.payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.wuhen.cloud.provider.payment.service.PaymentService;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/hystrix/ok")
    public String paymentOk() {
        String msg = paymentService.paymentOk() + "-->port: " + port;
        log.info("-----" + msg);
        return msg;
    }

    @GetMapping("/payment/hystrix/timeout")
    public String paymentTimeOut() {
        String msg = paymentService.paymentTimeOut() + "-->port: " + port;
        log.info("-----" + msg);
        return msg;
    }

    // 服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id)
    {
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("****result: "+result);
        return result;
    }
}
