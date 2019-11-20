package site.paranoia.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.paranoia.api.HelloService;

/**
 * Created by Paranoia on 2019-08-12 人间不值得
 **/
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Reference
    HelloService helloService;

    @GetMapping()
    public String test() {
        String result = helloService.sayHello("Hello Nacos");
        return "Return : " + result;
    }
}
