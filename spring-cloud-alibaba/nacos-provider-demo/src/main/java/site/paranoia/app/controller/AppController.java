package site.paranoia.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping(value = "/app")
    public String getTest(@RequestParam String name) {
        return "APP ----" + name;
    }
}
