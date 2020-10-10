package site.paranoia;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.business.BusinessApplication;
import site.paranoia.order.domain.Business;
import site.paranoia.order.mapper.BusinessMapper;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = BusinessApplication.class)
public class SimpleTest {

    @Autowired
    BusinessMapper businessMapper;

    @Test
    public void testInsert() {
        Business business = new Business();
        business.setBusinessName("AAAA");
        businessMapper.insert(business);
    }

    @Test
    public void testSelect() {
        List<Business> userList = businessMapper.selectList(new QueryWrapper<>());
        userList.forEach(System.out::println);
    }
}
