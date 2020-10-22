package site.paranoia.order.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.paranoia.api.OrderService;
import site.paranoia.order.domain.Order;
import site.paranoia.order.mapper.OrderMapper;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertOrder() {
        var query = new LambdaQueryWrapper<Order>()
                .eq(Order::getId, 6).eq(Order::getUserId, 1);
        var order = orderMapper.selectOne(query);
        order.setAmount(order.getAmount() + 1);
        var num = orderMapper.update(order, query);
        if (num == 1) {
            throw new RuntimeException();
        }
        return num;
    }
}
