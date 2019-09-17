package site.paranoia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {

    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaDemoApplication.class, args);
    }

    void insertUser() {
        userService.findByUserName();
    }

    @Override
    public void run(String... args) throws Exception {
        insertUser();
    }
}
