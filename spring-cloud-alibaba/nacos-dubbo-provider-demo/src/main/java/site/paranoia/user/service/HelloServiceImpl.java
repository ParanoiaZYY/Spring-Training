package site.paranoia.user.service;

import org.apache.dubbo.config.annotation.DubboService;
import site.paranoia.api.HelloService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
