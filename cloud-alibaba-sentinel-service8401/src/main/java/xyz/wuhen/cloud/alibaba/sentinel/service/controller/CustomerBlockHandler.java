package xyz.wuhen.cloud.alibaba.sentinel.service.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import xyz.wuhen.cloud.api.commons.entities.CommonResult;


public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler");
    }

}
