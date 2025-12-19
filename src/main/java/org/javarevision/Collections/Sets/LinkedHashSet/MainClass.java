package org.javarevision.Collections.Sets.LinkedHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {

        /*
         *
         * Consider a scenario in which you have write a program such that you are given array of country
         * names such as  {"China", "India", "Indonesia", "Thailand", "Pakistan", "Iran", "UK", "Sri-Lanka", "Peru"},
         * you have to create LinkedHashSet such the countries like “Pakistan” and “Peru” which start with “p” would
         * not entered in LinkedHashSet and after creating it, you have to check how many countries having initial as “I”.
         *
         * */

        Set<String> countries = new LinkedHashSet<String>(Arrays.asList(new String[]{"China", "India", "Indonesia", "Thailand", "Pakistan", "Iran", "UK", "Sri-Lanka", "Peru"}));
        Set<String> temp = new LinkedHashSet<String>();
        for (String s : countries){
            if(!(s.equals("Pakistan") || s.equals("Peru"))){
                temp.add(s);
            }
        }

        System.out.println(temp);

        int count = 0;
        for (String s : countries){
            if(s.charAt(0) == 'I'){
                count++;
            }
        }
        System.out.println(count);
    }
}
