package site.paranoia;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.baomidou.dynamic.datasource.provider.DynamicDataSourceProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import tk.mybatis.spring.annotation.MapperScan;

@EnableWebMvc
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("site.paranoia.mapper")
public class SpringBootGradleStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGradleStarterApplication.class, args);
    }
}
