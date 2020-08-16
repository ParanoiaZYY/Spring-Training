package site.paranoia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.paranoia.domain.SUser;
import site.paranoia.service.UserService;

import java.util.List;

@SpringBootTest
class SpringBootDatasourceDemoApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        List<SUser> sUserList = userService.selectAllUsers();
        System.out.println(sUserList);
    }

}
