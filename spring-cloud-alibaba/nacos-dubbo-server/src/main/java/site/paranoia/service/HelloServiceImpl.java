package site.paranoia.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.api.domain.UserRequest;
import site.paranoia.api.service.HelloService;
import site.paranoia.domain.User;
import site.paranoia.mapper.UserMapper;

import java.util.Date;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String sayHello(UserRequest userRequest) {

        User user = new User();
        user.setUserName(userRequest.getUserName());
        user.setRealName(userRequest.getRealName());
        user.setPassWord(userRequest.getPassWord());
        user.setCreatedBy(2);
        user.setCreatedTime(new Date());
        user.setLastModifiedBy(2);
        user.setLastModifiedTime(new Date());
        user.setDeleteFlag(0);
        userMapper.insert(user);
        System.out.println(user.getId());

        return String.valueOf(user.getId());
    }
}
