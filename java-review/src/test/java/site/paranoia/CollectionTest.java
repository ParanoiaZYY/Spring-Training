package site.paranoia;

import org.junit.Test;
import org.springframework.util.ObjectUtils;

import java.util.*;
import java.util.function.Consumer;

public class CollectionTest {

    @Test
    public void testCollection() {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String, String> map = new HashMap<>();
    }

    @Test
    public void testArrayList() {
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

        peopleList.remove(p5);
        peopleList.remove(p3);

        for (People next : peopleList) {
            System.out.println(next.getName());
        }

        peopleList.forEach(people -> {

        });

        peopleList.forEach(item -> {
            System.out.println(item.getName() + "---" + item.getAge());
        });

        System.out.println("peopleList index 2 :" + peopleList.get(2));
    }

    @Test
    public void testLinkList() {
        List<People> peopleList = new LinkedList<>();
        peopleList.add(new People("A001", 23));
        peopleList.add(new People("A001", 23));
        peopleList.add(new People("A001", 23));
        peopleList.add(new People("A002", 24));
        peopleList.add(new People("A003", 25));
        peopleList.add(new People("A004", 26));

        peopleList.forEach(item -> {
            System.out.println(item.getName() + "---" + item.getAge());
        });
    }

    @Test
    public void testHashMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("A001", 23);
        map.put("A001", 23);
        map.put("A001", 23);
        map.forEach((key, value) -> {
            System.out.println(key + "---" + value);
        });
    }

    @Test
    public void testHashSet() {
        Set<String> set = new TreeSet<>();
        set.add("A001");
        set.add("A001");
        set.add("A002");
        set.add("A003");
        set.add("A004");
        set.forEach(item -> {
            System.out.println(item);
        });
    }

    /**
     * HashSet Demo
     * 测试 People 没有重写 hashCode equals
     */
    @Test
    public void testHashSet2() {
        Set<People> set = new HashSet<>();
        People people = new People("A001", 20);
        People people2 = new People("A001", 20);
        People people3 = new People("A002", 22);
        set.add(people);
        set.add(people2);
        set.add(people3);
        set.forEach(item -> System.out.println(item.getName() + "----" + item.getAge()));
    }

    @Test
    public void testTreeSet() {
        Set<String> set = new TreeSet<>();
        set.add("A001");
        set.add("A001");
        set.add("A002");
        set.add("A003");
        set.add("A004");
        set.forEach(System.out::println);
    }



    @Test
    public void testVector() {
        List<People> peopleList = new Vector<>();
        peopleList.add(new People("A001", 23));
        peopleList.add(new People("A001", 23));
        peopleList.add(new People("A001", 23));
        peopleList.add(new People("A002", 24));
        peopleList.add(new People("A003", 25));
        peopleList.add(new People("A004", 26));

        peopleList.forEach(item -> {
            System.out.println(item.getName() + "---" + item.getAge());
        });
    }
}
