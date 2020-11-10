package site.paranoia.order.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.OrderUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.paranoia.api.AccountService;
import site.paranoia.order.domain.Order;
import site.paranoia.order.mapper.OrderMapper;

import java.math.BigDecimal;

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

        var order = new Order();
        order.setUserId("1");
        order.setOrderNo("A001");
        order.setAmount(new BigDecimal(1));
        var num = orderMapper.insert(order);
        if (num != 1) {
            throw new RuntimeException();
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertOrderA() throws Exception {
        accountService.insertAccount();
    }
}
