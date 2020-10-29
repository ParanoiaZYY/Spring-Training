package site.paranoia.order.service;

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
        var order = new Order();
        order.setUserId("1");
        order.setAmount((double) 1);
        var num = orderMapper.insert(order);
        if (num == 1) {
            throw new RuntimeException();
        }
        return num;
    }

    @Override
    public int deleteOrder(Integer id) {
        var num = orderMapper.deleteById(id);
        return num;
    }
}
