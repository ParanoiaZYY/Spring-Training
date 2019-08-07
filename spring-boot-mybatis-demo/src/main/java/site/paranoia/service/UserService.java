package site.paranoia.service;

import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.domain.User;
import site.paranoia.mapper.UserMapper;

public class UserService {

    @Autowired
    UserMapper userMapper;

    public void addUser() {
        User user = new User();
        user.setName("21121212");
    }
}
