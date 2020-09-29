package site.paranoia;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListTest {

    @Test
    public void test() {

        String[] arr = {"1", "2", "3"};
        List list = Arrays.asList(arr);
        try {
            list.add("5");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
