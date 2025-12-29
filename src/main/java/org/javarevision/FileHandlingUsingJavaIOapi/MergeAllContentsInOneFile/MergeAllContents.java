package org.javarevision.FileHandlingUsingJavaIOapi.MergeAllContentsInOneFile;

import java.io.*;

public class MergeAllContents {

    /*
        Write a program to merge all contents in the files present in the
        given folder.
        */

    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("output.txt");
        File file = new File("src/main/resources/files/");
        String[] s = file.list();
        for (String s1 : s) {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/files/"
                    + s1));
            String line = br.readLine();
            while (line != null){
                printWriter.println(line);
                line= br.readLine();
            }
        }
        printWriter.flush();
    }

}
