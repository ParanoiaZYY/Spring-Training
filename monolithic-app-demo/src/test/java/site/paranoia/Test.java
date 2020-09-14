package site.paranoia;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    @org.junit.Test
    public void test() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Test.run");
            }
        });
        System.out.println(thread.getState());
        thread.start();
    }
}
