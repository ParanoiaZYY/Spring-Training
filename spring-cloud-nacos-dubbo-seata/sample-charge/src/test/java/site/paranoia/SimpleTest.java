package site.paranoia;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.domain.Charge;
import site.paranoia.mapper.ChargeMapper;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ChargeApplication.class)
public class SimpleTest {

    @Autowired
    ChargeMapper chargeMapper;

    @Test
    public void testSelect() {
        List<Charge> chargeList = chargeMapper.selectList(new QueryWrapper<>());
        chargeList.forEach(System.out::println);
    }
}
