package org.javarevision.Collections.Maps.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Exercise {
    public static void main(String[] args) {
        String str = "aabsbvegbevsdcwdcacxwcxwdfvevcwdxcdvrvfwvccwdv";
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                Integer value = map.get(str.charAt(i));
                value++;
                map.replace(str.charAt(i), value);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry m : map.entrySet()) {
            if((Integer) m.getValue() % 2 == 0) {
                Character key = (Character) m.getKey();
                str = str.replaceAll(String.valueOf(key), "");
            }
        }
        System.out.println("Final String: " + str);
    }
}
