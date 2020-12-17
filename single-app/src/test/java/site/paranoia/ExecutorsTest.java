package site.paranoia;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsTest {

    @Test
    public void test() {
        ExecutorService es = Executors.newFixedThreadPool(3);
    }
}
