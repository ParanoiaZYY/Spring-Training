package site.paranoia.order.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.api.OrderService;
import site.paranoia.order.mapper.OrderMapper;

@DubboService
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public int insertOrder() {
        return 0;
    }
}
