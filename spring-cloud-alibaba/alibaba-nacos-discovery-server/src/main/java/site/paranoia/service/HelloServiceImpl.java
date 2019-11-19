package site.paranoia.service;

import site.paranoia.api.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String s) {
        return s;
    }
}
