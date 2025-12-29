package org.javarevision.FileHandlingUsingJavaIOapi.UsingBufferedReaderandBufferedWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("abc.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        /*// read character by character
        int i = bufferedReader.read();
        while (i != -1){
            System.out.println((char)i);
            i = bufferedReader.read();
        }
        bufferedReader.close();*/

        /*// read line by line
        String s = bufferedReader.readLine();
        while (s != null) {
            System.out.println(s);
            s = bufferedReader.readLine();
        }
        bufferedReader.close();*/

        /*// Reading with the help of array
        char c[] = new char[100];
        bufferedReader.read(c);
        System.out.println(c);
        bufferedReader.close();*/

        char c[] = new char[100];
        bufferedReader.read(c, 4, 5);
        System.out.println(c);
        bufferedReader.close();
    }
}
