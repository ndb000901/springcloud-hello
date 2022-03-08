package xyz.wuhen.cloud.alibaba.seata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.wuhen.cloud.alibaba.seata.domain.CommonResult;
import xyz.wuhen.cloud.alibaba.seata.domain.Order;
import xyz.wuhen.cloud.alibaba.seata.service.OrderService;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
 
 