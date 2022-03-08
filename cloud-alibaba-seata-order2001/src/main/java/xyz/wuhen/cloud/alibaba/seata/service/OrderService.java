package xyz.wuhen.cloud.alibaba.seata.service;

import xyz.wuhen.cloud.alibaba.seata.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
 
