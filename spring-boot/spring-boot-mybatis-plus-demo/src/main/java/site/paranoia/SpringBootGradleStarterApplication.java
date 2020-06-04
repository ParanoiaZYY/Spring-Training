package site.paranoia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@MapperScan("site.paranoia.mapper")
public class SpringBootGradleStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGradleStarterApplication.class, args);
    }

}
