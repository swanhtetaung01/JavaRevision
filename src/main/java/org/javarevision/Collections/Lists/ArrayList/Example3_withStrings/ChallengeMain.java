package org.javarevision.Collections.Lists.ArrayList.Example3_withStrings;

import java.util.ArrayList;
import java.util.Arrays;

public class ChallengeMain {
    public static void main(String[] args) {
        /*
        * You are given two arraylist, one list contains names of Students who like Maths and the
        * second list contains names of Students who like Science,
        * you have to figure out the names of Students who like both science and Maths.
        *
        *Students who like maths : "Ram", "Tom", "Ravi", "Tanvi", "Vikas"
        *Students who like science : "John", "Ravi", "Abhi", "Vikas", "Faisal"
        * */

        ArrayList<String> maths = new ArrayList<String>();
        maths.addAll(Arrays.asList(new String[]{"Ram", "Tom", "Ravi", "Tanvi", "Vikas"}));

        ArrayList<String> science = new ArrayList<String>();
        science.addAll(Arrays.asList(new String[]{"John", "Ravi", "Abhi", "Vikas", "Faisal"}));

        for (int i = 0; i<maths.size();i++){
            for (int j = 0;j < science.size(); j++){
                if(maths.get(i) == science.get(j)){
                    System.out.println(maths.get(i));
                }
            }
        }


    }
}
