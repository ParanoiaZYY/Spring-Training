package site.paranoia.module;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app")
public class TestController {

    @GetMapping
    public String testApp() {
        return "Hello App";
    }
}
