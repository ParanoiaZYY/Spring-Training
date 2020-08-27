package site.paranoia.module.test.domain;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class ValidationTest {

    @NotBlank(message = "姓名不能为空！")
    @Size(min = 1, max = 50)
    private String name;

    @Min()
    private Integer age;

    @NotEmpty(message = "data 不能为空！")
    private List<String> data;
}
