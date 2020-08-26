package site.paranoia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.domain.DatabaseConfig;
import site.paranoia.domain.User;
import site.paranoia.service.DatabaseConfigService;
import site.paranoia.service.UserService;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Autowired
    UserService userService;

    @Autowired
    DatabaseConfigService databaseConfigService;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.selectAll();
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelectAllDatabase() {
        System.out.println(("----- selectAll method test ------"));
        List<DatabaseConfig> databaseConfigs = databaseConfigService.selectAll();
        databaseConfigs.forEach(System.out::println);
    }

    @Test
    public void insertUserOnSlave1Test() throws SQLException {
        List<DatabaseConfig> databaseConfigs = databaseConfigService.selectAll();
        databaseConfigs.forEach(System.out::println);

        Set<String> set = databaseConfigService.addDruid(databaseConfigs.get(0));
        System.out.println(set);
    }

    @Test
    public void getCurrentDataSources() {
        Set<String> set = databaseConfigService.getCurrentDataSources();
        System.out.println(set);
    }

    @Test
    public void addUser() throws SQLException {
        User user = new User();
        user.setName("AAAAAAAA");
        user.setAge(26);
        user.setEmail("wqd_1994");
        user.setPassword("wqd_1994");
        user.setUrl("wqd_1994");

        List<DatabaseConfig> databaseConfigs = databaseConfigService.selectAll();
        DatabaseConfig databaseConfig = databaseConfigs.get(0);
        databaseConfigService.addDruid(databaseConfig);
        userService.addUser(databaseConfig, user);
        databaseConfigService.remove(databaseConfig.getName());

        User user2 = new User();
        user2.setName("BBBBBB");
        user2.setAge(26);
        user2.setEmail("wqd_1994");
        user2.setPassword("wqd_1994");
        user2.setUrl("wqd_1994");
        databaseConfig = databaseConfigs.get(1);
        databaseConfigService.addDruid(databaseConfig);
        userService.addUser(databaseConfig, user2);
        databaseConfigService.remove(databaseConfig.getName());

    }
}
