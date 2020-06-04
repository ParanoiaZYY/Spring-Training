package site.paranoia.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.paranoia.api.domain.UserRequest;
import site.paranoia.api.service.HelloService;

import java.util.Date;

/**
 * Created by Paranoia on 2019-08-12 人间不值得
 **/
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Reference
    HelloService helloService;

    @GetMapping()
    public String test() {

        UserRequest userRequest = new UserRequest();
        userRequest.setUserName("wqd1994");
        userRequest.setRealName("王权道");
        userRequest.setPassWord("123456");
        userRequest.setCreatedBy(1);
        userRequest.setCreatedTime(new Date());
        userRequest.setLastModifiedBy(1);
        userRequest.setLastModifiedTime(new Date());
        userRequest.setDeleteFlag(0);

        String result = helloService.sayHello(userRequest);
        return "Return : " + result;
    }
}
