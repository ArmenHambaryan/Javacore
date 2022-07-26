package Homework.lesson25;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer,String> stringMap = new HashMap<>();
        stringMap.put(111,"poxos");
        stringMap.put(222,"petris");
        Collection<String> values = stringMap.values();
        for (String value : values) {
            System.out.println(value);
        }
        Set<Integer> integers = stringMap.keySet();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
