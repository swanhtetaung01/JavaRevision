package org.javarevision.StringsStringBuffer;

public class Substrings {
    public static void main(String[] args) {
        //                     1
        //           0123456789012
        String str = "Hello, World!";
        System.out.println(str.substring(7));
        System.out.println(str.substring(7, 12));

        //                       1         2
        //             012345678901234567890
        String str1 = "Java Programming is fun!";
        System.out.println(str1.substring(5)); // Programming is fun!
        System.out.println(str1.substring(5, 16)); //Programming
        System.out.println(str1.substring(20)); // fun!

        // Extraction of a domain from URL
        //                      1         2
        //            012345678901234567890123
        String url = "https://www.example.com";
        //System.out.println(url.indexOf("www.") + 4);
        //System.out.println(url.indexOf(".") + 1);

        //System.out.println(url.lastIndexOf("."));
        String domain = url.substring(url.indexOf("www.") + 4,url.lastIndexOf("."));
        System.out.println(domain);


        // Processing variable length data
        String line = "John,Doe,30,Software Engineer";
        String[] fields = line.split(",");
        String firstName = fields[0];
        String lastName = fields[1];
        System.out.println(firstName + " " + lastName);  // Output: John Doe

//        Removing Prefix or Suffix

        String fullName = "Mr. John Doe";
        String nameWithoutPrefix = fullName.substring(4);
        System.out.println(nameWithoutPrefix);

        String fileName = "example.txt";
        String nameWithoutExtension = fileName.substring(0, fileName.lastIndexOf("."));
        System.out.println(nameWithoutExtension);

    }
}

