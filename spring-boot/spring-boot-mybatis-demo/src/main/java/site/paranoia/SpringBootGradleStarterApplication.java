package site.paranoia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import tk.mybatis.spring.annotation.MapperScan;

@EnableWebMvc
@SpringBootApplication
@MapperScan("site.paranoia.mapper")
public class SpringBootGradleStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGradleStarterApplication.class, args);
    }

}
