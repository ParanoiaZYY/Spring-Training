package site.paranoia;

import org.junit.Test;
import org.junit.experimental.theories.Theories;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StringTest {

    @Test
    public static void test() {
        String a = "122";

        int b = 10;

        Integer c = 10;

        final double MAX_LENGTH = 12;

        System.out.println();

        System.out.printf("");

        System.out.println("StringTest.test");

        switch (b) {
            case 1:
                System.out.println("Selected 1");
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }

        try {

        } catch (Exception e) {

        }finally {

        }
        BigDecimal amount = new BigDecimal(10);
        BigDecimal amount2 = new BigDecimal(20);
        if (amount.compareTo(amount2) == 0) {};
    }
}
