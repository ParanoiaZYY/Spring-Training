package site.paranoia.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import site.paranoia.domain.DatabaseConfig;
import site.paranoia.domain.User;
import site.paranoia.mapper.UserMapper;

import java.util.List;

@Service
@AllArgsConstructor
@DS("#session.dataName")
public class UserService {

    UserMapper userMapper;

    public void addUser(DatabaseConfig databaseConfig, User user) {
        userMapper.insert(user);
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
