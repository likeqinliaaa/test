package org.qin.empprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope   //自动刷新，必须配控制器上不写main方法
public class ConfigClientController {
    @Value("${test}")    // 注入配置中心中的test配置信息
    private String test;

    @GetMapping("/test")
    public String getConfigInfo() {
        return "Hello:"+test;
    }
}
