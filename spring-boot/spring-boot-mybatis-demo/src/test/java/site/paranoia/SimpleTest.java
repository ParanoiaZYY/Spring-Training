package site.paranoia;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.domain.User;
import site.paranoia.mapper.UserMapper;

import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectAllUser();
        userList.forEach(System.out::println);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("wqd1994");
        user.setEmail("wqd_1994@163.com");
        user.setAge(22);
        userMapper.insertUser(user);
        System.out.println(user.getId());
    }
}
