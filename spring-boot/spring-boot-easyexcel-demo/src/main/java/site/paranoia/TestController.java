package site.paranoia;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Paranoia on 2019/9/10 人间不值得
 **/
@RestController(value = "/test")
public class TestController {

    @PostMapping
    public void test(@RequestBody ExcelData test) {
    }
}
