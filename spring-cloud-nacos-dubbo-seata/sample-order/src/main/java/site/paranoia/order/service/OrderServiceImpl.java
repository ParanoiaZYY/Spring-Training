package site.paranoia.order.service;

import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.paranoia.api.AccountService;
import site.paranoia.order.domain.Order;
import site.paranoia.order.mapper.OrderMapper;

@Service
public class OrderServiceImpl {

    @Autowired
    OrderMapper orderMapper;

    @DubboReference
    AccountService accountService;

    @GlobalTransactional
    @Transactional(rollbackFor = Exception.class)
    public void insertOrder() throws Exception {

        accountService.insertAccount();

        Order order = new Order();
        order.setAmount(1d);
        order.setOrderNo("A001");
        order.setCommodityCode("0001");
        order.setCount(1);
        orderMapper.insert(order);
        throw new Exception();
    }
}
