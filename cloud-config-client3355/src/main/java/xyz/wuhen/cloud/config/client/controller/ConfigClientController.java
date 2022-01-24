package xyz.wuhen.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.wuhen.cloud.config.client.ConfigClientMain3355;

@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.name}")
    private String name;

    @Value("${config.version}")
    private String version;

    @GetMapping("/config")
    public String config() {
        return "name: " + name + "    version: " + version;
    }
}
