package site.paranoia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public void testStream() {
        List<People> peopleList = new ArrayList<>();
        People p1 = new People("A001", 23);
        People p2 = new People("A001", 23);
        People p3 = new People("A002", 24);
        People p4 = new People("A003", 24);
        People p5 = new People("A004", 26);

        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);
        peopleList.add(p4);
        peopleList.add(p5);

        peopleList.stream().filter(item -> item.getName().equals("A001")).collect(Collectors.toList());
    }
}
