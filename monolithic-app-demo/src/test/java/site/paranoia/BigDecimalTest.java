package site.paranoia;

import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalTest {

    @Test
    public void testBigDecimal() {
        BigDecimal bigDecimal = BigDecimal.ZERO;

        System.out.println(new BigDecimal(0.1).add(new BigDecimal(0.2)));
        System.out.println(new BigDecimal(1.0).subtract(new BigDecimal(0.8)));
        System.out.println(new BigDecimal(4.015).multiply(new BigDecimal(100)));
        System.out.println(new BigDecimal(123.3).divide(new BigDecimal(100)));
    }

    @Test
    public void testBigDecimal2() {
        BigDecimal bigDecimal = BigDecimal.ZERO;

        System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.2")));
        System.out.println(new BigDecimal("1.0").subtract(new BigDecimal("0.8")));
        System.out.println(new BigDecimal("4.015").multiply(new BigDecimal("100")));
        System.out.println(new BigDecimal("123.3").divide(new BigDecimal("100")));
    }

    @Test
    public void testBigDecimal3() {
        System.out.println(new BigDecimal("4.015").multiply(new BigDecimal(Double.toString(100))));
    }
}
