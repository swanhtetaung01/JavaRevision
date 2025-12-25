package org.javarevision.FileHandlingUsingJavaIOapi.UsingFileWriterandFileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("abc.txt", false);
        fileWriter.write("Abc");

        fileWriter.write("\n");

        char[] ch = new char[]{'x','y','z'};
        fileWriter.write(ch);

        fileWriter.write('p');

        fileWriter.flush();
        fileWriter.close();
    }
}
