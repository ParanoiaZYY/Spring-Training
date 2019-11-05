package site.paranoia;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.paranoia.domain.SUser;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser() {
        SUser sUser = new SUser();
        sUser.setId(null);
        sUser.setUserName("12333");
        userRepository.save(sUser);
    }

    public void selectUserList() {
        userRepository.findAll().forEach(item -> log.info(item.toString()));
    }

    public void findByUserName() {
    }
}
