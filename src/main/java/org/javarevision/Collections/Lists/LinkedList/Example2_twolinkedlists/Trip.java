package org.javarevision.Collections.Lists.LinkedList.Example2_twolinkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Trip {
    public static void main(String[] args) {

        List<String> class1 = new LinkedList<String>();
        class1.add("Ram");
        class1.add("Michael");
        class1.add("John");
        class1.add("Ron");

        List<String> class2 = new LinkedList<String>();
        class2.add("Harry");
        class2.add("Ram");
        class2.add("Lita");
        class2.add("John");

        for (String name_c1 : class1) {
            for (String name_c2 : class2) {
                if(name_c1.equals(name_c2)){
                    System.out.println("The name " + name_c1 + " is in both classes.");
                }
            }
        }
    }
}
