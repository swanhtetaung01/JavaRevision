package org.javarevision.FileHandlingUsingJavaIOapi.SerializationAndDeserialization;

import java.io.*;

class CarCustom implements Serializable{
    String name;
    transient String color;

    public CarCustom(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        String colorTemp = "aa"+color;
        objectOutputStream.writeObject(colorTemp);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String colorTemp = (String) objectInputStream.readObject();
        color = colorTemp.substring(2);
    }

}

public class CustomSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CarCustom car = new CarCustom("Ferrari", "Red");

        //Serialization
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(car);

        //Deserialization
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("abc.txt"));
        CarCustom car1 = (CarCustom) objectInputStream.readObject();

        System.out.println(car1.name);
        System.out.println(car1.color);
    }
}
