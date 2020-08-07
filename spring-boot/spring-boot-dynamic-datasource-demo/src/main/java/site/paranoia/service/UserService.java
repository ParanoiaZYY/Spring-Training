package site.paranoia.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.domain.User;
import site.paranoia.mapper.UserMapper;

import java.util.List;

@DS("master")
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void addUser() {
        User user = new User();
        user.setName("21121212");
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
