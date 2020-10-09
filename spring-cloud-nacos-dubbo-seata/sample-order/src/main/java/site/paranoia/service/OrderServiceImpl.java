package site.paranoia.service;

import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.domain.Order;
import site.paranoia.mapper.OrderMapper;

public class OrderServiceImpl{

    @Autowired
    OrderMapper orderMapper;

    public void addUser() {
        Order order = new Order();
    }
}
