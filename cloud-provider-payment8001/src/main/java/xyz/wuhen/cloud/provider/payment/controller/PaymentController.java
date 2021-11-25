package xyz.wuhen.cloud.provider.payment.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyz.wuhen.cloud.api.commons.entities.CommonResult;
import xyz.wuhen.cloud.api.commons.entities.Payment;
import xyz.wuhen.cloud.provider.payment.service.PaymentService;

import java.util.List;


@Slf4j
@Controller
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private int port;

    @PostMapping(value = "/payment/create")
    @ResponseBody
    public CommonResult create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("*****插入操作返回结果:" + result);

        if(result > 0)
        {
            return new CommonResult(200,"插入数据库成功 port: " + port ,result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    @ResponseBody
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果:{}",payment);
        if (payment != null) {
            return new CommonResult(200,"查询成功 port:" + port,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("hello")
    @ResponseBody
    public Payment hello() {
        String sql = "select * from payment where id = 1";
        Payment payment = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Payment.class));
        System.out.println(payment.toString());
        return payment;
    }


    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/payment/discovery")
    @ResponseBody
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String v : services) {
            System.out.println(v);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            System.out.println("Id: " + instance.getServiceId() + "\nHost: " + instance.getHost() + "\nPort: " + instance.getPort() + "Uri:" + instance.getUri());
        }
        return this.discoveryClient;
    }

}
