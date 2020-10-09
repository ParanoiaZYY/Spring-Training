package site.paranoia;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.domain.Order;
import site.paranoia.mapper.OrderMapper;

import java.util.List;
import java.util.UUID;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication.class)
public class SimpleTest {

    @Autowired
    OrderMapper orderMapper;

    @Test
    public void insertOrder() {
        Order order = new Order();
        order.setOrderNo(UUID.randomUUID().toString());
        orderMapper.insert(order);
    }

    @Test
    public void testSelect() {
        List<Order> orderList = orderMapper.selectList(new QueryWrapper<>());
        orderList.forEach(System.out::println);
    }
}
