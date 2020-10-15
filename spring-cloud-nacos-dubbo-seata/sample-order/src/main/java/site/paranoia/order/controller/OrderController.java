package site.paranoia.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.paranoia.order.service.OrderServiceImpl;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    OrderServiceImpl orderService;

    @GetMapping
    public void addOrder() throws Exception {
        orderService.insertOrder();
    }

    @GetMapping(value = "/a")
    public void addOrderA() throws Exception {
        orderService.insertOrderA();
    }
}
