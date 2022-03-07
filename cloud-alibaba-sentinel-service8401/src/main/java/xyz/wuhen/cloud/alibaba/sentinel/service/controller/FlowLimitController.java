package xyz.wuhen.cloud.alibaba.sentinel.service.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        return "testA---------";
    }
    @GetMapping("testB")
    public String testB() {
        return "testB---------";
    }

    @GetMapping("testC")
    public String testC() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "testC";
    }

    @GetMapping("testD")
    public String testD() {
        int a = 1 / 0;
        return "/testD";
    }

    @GetMapping("/testHotKey/{p1}/{p2}")
    @SentinelResource(value = "hot",blockHandler = "blockHandlerHotKey")
    public String testHotKey(@PathVariable(value = "p1",required = false) String p1,
                             @PathVariable(value = "p2",required = false) String p2) {
        return "p1: " + p1 + "  p2: " + p2;
    }

    public String blockHandlerHotKey(String p1, String p2, BlockException exception) {
        return "blockHandlerHotKey";
    }
}
