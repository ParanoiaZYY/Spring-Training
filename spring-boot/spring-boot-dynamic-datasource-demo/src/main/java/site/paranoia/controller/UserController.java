package site.paranoia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.paranoia.domain.DatabaseConfig;
import site.paranoia.domain.User;
import site.paranoia.service.DatabaseConfigService;
import site.paranoia.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    DatabaseConfigService databaseConfigService;

    @PostMapping
    public void testAddUser(HttpServletRequest request) throws SQLException {
        System.out.println(request);
        User user = new User();
        user.setName("AAAAAAAA");
        user.setAge(26);
        user.setEmail("wqd_1994");
        user.setPassword("wqd_1994");
        user.setUrl("wqd_1994");

        List<DatabaseConfig> databaseConfigs = databaseConfigService.selectAll();
        DatabaseConfig databaseConfig = databaseConfigs.get(0);
        databaseConfigService.addDruid(databaseConfig);
        request.getSession().setAttribute("dataName", databaseConfig.getName());
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
        request.getSession().setAttribute("dataName", databaseConfig.getName());
        userService.addUser(databaseConfig, user2);
        databaseConfigService.remove(databaseConfig.getName());

    }
}
