package site.paranoia;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.baomidou.dynamic.datasource.provider.DynamicDataSourceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@EnableWebMvc
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@EnableConfigurationProperties({LiquibaseProperties.class})
@MapperScan("site.paranoia.mapper")
public class SpringBootGradleStarterApplication implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGradleStarterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(dataSource.getConnection().toString());
    }
}
