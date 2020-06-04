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
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootGradleStarterApplication.class)
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
        user.setUserName("wqd1994");
        user.setRealName("王权道");
        user.setPassWord("123456");
        user.setCreatedBy(1);
        user.setCreatedTime(new Date());
        user.setLastModifiedBy(1);
        user.setLastModifiedTime(new Date());
        user.setDeleteFlag(0);
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
        int result = userMapper.updateByPrimaryKeySelective(user);
        System.out.println(result);
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(10);
        int result = userMapper.updateByPrimaryKeySelective(user);
        System.out.println(result);
    }
}
