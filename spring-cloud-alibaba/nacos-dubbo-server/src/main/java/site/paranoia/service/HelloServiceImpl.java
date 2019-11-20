package site.paranoia.service;

import org.apache.dubbo.config.annotation.Service;
import site.paranoia.api.HelloService;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String s) {
        return s;
    }
}
