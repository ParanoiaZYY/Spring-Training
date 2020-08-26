package site.paranoia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    @Transactional(rollbackFor = RollbackException.class)
    public void insertUser() throws RollbackException {
        jdbcTemplate.execute("INSERT INTO s_user(name) VALUES ('Paranoia1994');");
        throw new RollbackException();
    }
}
