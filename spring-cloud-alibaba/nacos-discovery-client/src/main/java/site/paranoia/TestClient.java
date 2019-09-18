package site.paranoia;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Paranoia on 2019-08-12 人间不值得
 **/
@FeignClient("nacos-discory-server")
public interface TestClient {
    @GetMapping("/test")
    String test(@RequestParam(name = "name") String name);
}
