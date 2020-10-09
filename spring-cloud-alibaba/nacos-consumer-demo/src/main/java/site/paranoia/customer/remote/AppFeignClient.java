package site.paranoia.customer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-nacos-provider-demo")
public interface AppFeignClient {
    @RequestMapping(value = "/app")
    String app(@RequestParam(value = "name") String name);
}
