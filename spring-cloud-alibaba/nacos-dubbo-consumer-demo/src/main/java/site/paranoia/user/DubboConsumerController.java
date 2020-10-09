package site.paranoia.user;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.paranoia.api.HelloService;

@RestController
@RequestMapping(value = "/consumer")
public class DubboConsumerController {

    @DubboReference
    HelloService helloService;

    @GetMapping(value = "/{name}")
    public String test(@PathVariable(value = "name") String name) {
        return helloService.sayHello(name);
    }
}
