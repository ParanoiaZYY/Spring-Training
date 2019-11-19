package site.paranoia.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Paranoia on 2019-08-12 人间不值得
 **/
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(@RequestParam String name) {
        log.info("invoked name = " + name);
        return "hello " + name;
    }
}
