package site.paranoia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringJpaDemoApplication.class)

public class SUserTest {

    @Autowired
    UserService userService;

    @Test
    public void testAddUser() {
        userService.addUser();
    }

    @Test
    public void selectUser() {
        userService.selectUserList();
    }
}
