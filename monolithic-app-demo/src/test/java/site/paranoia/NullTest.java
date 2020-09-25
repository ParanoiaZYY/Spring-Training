package site.paranoia;

import cn.hutool.core.util.ObjectUtil;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class NullTest {
    public void test() {
        String a = "";
        if (!StringUtils.isEmpty(a)) {

        }

        if (!ObjectUtil.isEmpty(a)) {

        }

        if (!ObjectUtils.isEmpty(a)) {

        }
    }
}
