package site.paranoia.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.paranoia.order.service.OrderServiceImpl;
import site.paranoia.order.service.TccTransactionService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    TccTransactionService tccTransactionService;

    @GetMapping
    public void addOrder() throws Exception {
        tccTransactionService.doTransactionCommit();
    }
}
