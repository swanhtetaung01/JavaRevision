package org.javarevision.FileHandlingUsingJavaIOapi.MergeAllContentsInOneFile;

import java.io.*;

public class MergeAllContents_01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader1 = new FileReader("files/abc.txt");
        FileReader fileReader2 = new FileReader("files/abc_1.txt");

        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

        String file_oneText = bufferedReader1.readLine();
        String file_twoText = bufferedReader2.readLine();

        FileWriter fileWriter = new FileWriter("./files/abc_2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(file_oneText);
        bufferedWriter.write(file_twoText);

        bufferedWriter.close();
        FileReader fileReader3 = new FileReader("./files/abc_2.txt");
        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
        String file_threeText = bufferedReader3.readLine();
        System.out.println("Merged File Data: " + file_threeText);
    }
}
