package site.paranoia.service;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.creator.DataSourceCreator;
import com.baomidou.dynamic.datasource.creator.DruidDataSourceCreator;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DataSourceProperty;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.paranoia.domain.DatabaseConfig;
import site.paranoia.mapper.DataBaseConfigMapper;

import javax.sql.DataSource;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class DatabaseConfigService {

    @Autowired
    DataBaseConfigMapper dataBaseConfigMapper;

    private final DataSource dataSource;

    private final DataSourceCreator dataSourceCreator;

    private final DruidDataSourceCreator druidDataSourceCreator;

    public List<DatabaseConfig> selectAll() {
        return dataBaseConfigMapper.selectAll();
    }

    public Set<String> addDruid(DatabaseConfig databaseConfig) {
        DataSourceProperty dataSourceProperty = new DataSourceProperty();
        dataSourceProperty.setPoolName(databaseConfig.getName());
        dataSourceProperty.setUrl(databaseConfig.getUrl());
        dataSourceProperty.setUsername(databaseConfig.getUsername());
        dataSourceProperty.setPassword(databaseConfig.getPassword());
        dataSourceProperty.setDriverClassName(databaseConfig.getDriveName());
        DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;
        DataSource dataSource = druidDataSourceCreator.createDataSource(dataSourceProperty);
        ds.addDataSource(databaseConfig.getName(), dataSource);
        return ds.getCurrentDataSources().keySet();
    }

    public String remove(String name) {
        DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;
        ds.removeDataSource(name);
        return "删除成功";
    }

    public Set<String> getCurrentDataSources() {
        DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;
        return ds.getCurrentDataSources().keySet();
    }
}
