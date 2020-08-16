package site.paranoia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import site.paranoia.domain.SUser;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insertUsers() {
        String sql = "INSERT INTO s_user(name, age) VALUES ('222', 20);";
        int row = jdbcTemplate.update(sql);
        System.out.println(row);
        return row;
    }

    @Override
    public List<SUser> selectAllUsers() {
        String sql = "select * from s_user where id = ?";
        List<SUser> userList = jdbcTemplate.query(sql, new SUser(), new Object[]{1});
        return userList;
    }
}
