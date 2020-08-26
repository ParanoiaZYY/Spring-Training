package site.paranoia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by Paranoia on 2019-08-07 人间不值得
 **/
@NoRepositoryBean
public interface CommonRepository<T, ID> extends JpaRepository<T, ID> {
}
