package site.paranoia.order.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
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

        var query = new LambdaQueryWrapper<Order>()
                .eq(Order::getId, 6).eq(Order::getUserId, 1);
        var order = orderMapper.selectOne(query);
        order.setAmount(order.getAmount() + 1);
        orderMapper.update(order, query);
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertOrderA() throws Exception {
        accountService.insertAccount();
    }
}
