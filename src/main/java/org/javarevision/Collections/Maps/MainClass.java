package org.javarevision.Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {

        Map<String, String> schoolMap = new HashMap<>();
        schoolMap.put("1", "John");
        schoolMap.put("2", "Oliver");
        schoolMap.put("3", "Micheal");
        schoolMap.put("3", "Daniel");
        schoolMap.put(null, "Null key");
        schoolMap.put(null, "Null key2");
        schoolMap.put(null, null);
        for (Map.Entry m : schoolMap.entrySet()) {
            System.out.println("Roll no : " + m.getKey() + " Name : " + m.getValue());
        }
    }
}
