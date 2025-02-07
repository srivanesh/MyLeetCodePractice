package com.code.easy;

import java.util.*;

public class IterartorsEx {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        Iterator<Map.Entry<String, Integer>> iteratorMap = map.entrySet().iterator();
        while (iteratorMap.hasNext()) {
            Map.Entry<String, Integer> entry = iteratorMap.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
