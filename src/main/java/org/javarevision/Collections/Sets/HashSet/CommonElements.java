package org.javarevision.Collections.Sets.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {

        HashSet<String> c1 = new HashSet(Arrays.asList("Ram", "Rack", "Dhoni", "Harshad", "Modi", "Vijay", "Sonia"));
        HashSet<String> c2 = new HashSet(Arrays.asList("Ravi", "Faisal", "Prateek", "Aghishek", "Dhoni", "Harshad", "Ram", "Akash"));
        HashSet<String> c3 = new HashSet(Arrays.asList("Modi", "Vijay", "Dhoni", "Faisal", "Prateek", "Harshad", "Ram", "Ravi"));

        HashSet<String> result = commonElements(c1, c2, c3);
        System.out.println("CommonElements are: " + result);
    }
    public static HashSet commonElements(HashSet<String> s1, HashSet<String> s2, HashSet<String> s3){

        HashSet<String> result = new HashSet<String>(s1);
        result.retainAll(s2);
        result.retainAll(s3);
        System.out.println(result);
        return result;
    }
}
