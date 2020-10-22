package site.paranoia;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.account.AccountApplication;
import site.paranoia.account.domain.Account;
import site.paranoia.account.mapper.AccountMapper;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = AccountApplication.class)
public class SimpleTest {

    @Autowired
    AccountMapper accountMapper;

    @Test
    public void testSelect() {
        List<Account> chargeList = accountMapper.selectList(new QueryWrapper<>());
        chargeList.forEach(System.out::println);
    }
}
