package site.paranoia.module.test.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.paranoia.module.test.domain.ValidationTest;
import site.paranoia.utils.Result;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/testValidation")
public class ValidationTestController {

    @PostMapping(value = "/test")
    public Result testValidate(@RequestBody @Valid ValidationTest validationTest, BindingResult result) {
        if (result.hasErrors()) {
            return new Result(400, "数据不合法，请检查！",result.getAllErrors());
        } else {
            return new Result();
        }

    }

}
