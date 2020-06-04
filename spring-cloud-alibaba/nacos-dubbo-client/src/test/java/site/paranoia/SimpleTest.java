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
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectAll();
        Assert.assertEquals(6, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void addUser() {
        User user = new User();
//        user.setName("wqd1994");
//        user.setEmail("wqd_1994@163.com");
//        user.setAge(22);
        userMapper.insert(user);
        System.out.println(user.getId());
    }

    @Test
    public void deleteUser() {
        User user = new User();
        int result = userMapper.delete(user);
        System.out.println(result);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        User user = new User();
        user.setId(10);
//        user.setName("2921212");
        int result = userMapper.updateByPrimaryKeySelective(user);
        System.out.println(result);
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(10);
//        user.setName("2921212");
        int result = userMapper.updateByPrimaryKeySelective(user);
        System.out.println(result);
    }
}
