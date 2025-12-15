package org.javarevision.Collections.Lists.LinkedList.Example3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UniqueNames {
    public static void main(String[] args) {

        List<String> class1 = new LinkedList<String>(Arrays.asList("Ram","Michael","John","Ron"));
        List<String> class2 = new LinkedList<String>(Arrays.asList("Harry", "Ferros", "Lita", "John"));

        List<String> combinedclass = finalStudentList(class1,class2);
        System.out.println(combinedclass);
    }
    public static List<String> finalStudentList(List<String> c1, List<String> c2) {
        List<String> results = c1;
        for (String student : c2) {
            if (!c1.contains(student)){
                results.add(student);
            }
        }
        return results;
    }
}
