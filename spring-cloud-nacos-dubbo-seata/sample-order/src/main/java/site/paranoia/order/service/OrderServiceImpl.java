package site.paranoia.order.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.paranoia.api.AccountService;
import site.paranoia.order.mapper.OrderMapper;

@Service
public class OrderServiceImpl {

    @Autowired
    OrderMapper orderMapper;

    @DubboReference
    AccountService accountService;

    @Transactional(rollbackFor = Exception.class)
    public void insertOrder() throws Exception {

        accountService.insertAccount();

        var order = orderMapper.selectById(6);
        order.setAmount(order.getAmount() + 1);
        orderMapper.updateById(order);
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertOrderA() throws Exception {
        accountService.insertAccount();
    }
}
