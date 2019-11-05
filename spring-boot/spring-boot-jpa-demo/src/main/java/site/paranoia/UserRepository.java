package site.paranoia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.paranoia.domain.SUser;

@Repository
public interface UserRepository extends JpaRepository<SUser,Integer> {
}
