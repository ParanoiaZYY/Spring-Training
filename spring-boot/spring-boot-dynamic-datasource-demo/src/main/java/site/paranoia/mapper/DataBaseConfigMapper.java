package site.paranoia.mapper;

import org.springframework.stereotype.Repository;
import site.paranoia.domain.DatabaseConfig;
import site.paranoia.utils.MyMapper;

@Repository
public interface DataBaseConfigMapper extends MyMapper<DatabaseConfig> {
}
