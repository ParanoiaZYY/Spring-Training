package site.paranoia.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import site.paranoia.domain.User;
import site.paranoia.mapper.UserMapper;

public class UserService extends ServiceImpl<UserMapper, User> {

    public void addUser() {
        User user = new User();
        save(user);
    }
}
