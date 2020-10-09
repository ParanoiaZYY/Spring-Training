package site.paranoia.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.paranoia.customer.remote.AppFeignClient;
import site.paranoia.customer.service.CustomerService;

@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @Autowired
    AppFeignClient appFeignClient;

    @GetMapping(value = "/{name}")
    public String getTest(@PathVariable String name) {
        return appFeignClient.app(name);
    }

}
