package site.paranoia;

import org.junit.Test;

import java.util.Date;

public class DateTest {

    @Test
    public void test() {
        Date date = new Date(2019, 12, 31, 11, 12, 13);
        System.out.println(date);
    }

    @Test
    public void test2() {
        Date date = new Date(2019 - 1900, 11, 31, 11, 12, 13);
        System.out.println(date);
    }
}
