package site.paranoia.config;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import liquibase.integration.spring.SpringLiquibase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.concurrent.Executor;

@Configuration
@Slf4j
public class LiquibaseConfiguration {
    private final Environment env;

    public LiquibaseConfiguration(Environment env) {
        this.env = env;
    }

    @Autowired
    DataSource dataSource;

    @Bean
    public SpringLiquibase liquibase(@Qualifier("taskExecutor") Executor executor, LiquibaseProperties liquibaseProperties) {

        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(createNewDataSource(liquibaseProperties));
        liquibase.setChangeLog("classpath:config/liquibase/master.xml");
        liquibase.setContexts(liquibaseProperties.getContexts());
        liquibase.setDefaultSchema(liquibaseProperties.getDefaultSchema());
        liquibase.setDropFirst(liquibaseProperties.isDropFirst());
        liquibase.setLabels(liquibaseProperties.getLabels());
        liquibase.setChangeLogParameters(liquibaseProperties.getParameters());
        liquibase.setRollbackFile(liquibaseProperties.getRollbackFile());
        liquibase.setShouldRun(false);
        return liquibase;
    }

    private static DataSource createNewDataSource(LiquibaseProperties liquibaseProperties) {
        return DataSourceBuilder.create()
                .url(liquibaseProperties.getUrl())
                .username("root")
                .password("root")
                .build();
    }
}
