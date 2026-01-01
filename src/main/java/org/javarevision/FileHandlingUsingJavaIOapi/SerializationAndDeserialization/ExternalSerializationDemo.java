package org.javarevision.FileHandlingUsingJavaIOapi.SerializationAndDeserialization;

import java.io.*;

class CarExternal implements Externalizable{
    String name;
    String color;

    public CarExternal() {
    }

    public CarExternal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(color);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        color = (String) in.readObject();
    }
}

public class ExternalSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CarExternal car = new CarExternal("Ferrari", "Red");

        //Serialization
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(car);

        //Deserialization
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("abc.txt"));
        CarExternal car1 = (CarExternal) objectInputStream.readObject();

        System.out.println(car1.name);
        System.out.println(car1.color);
    }
}
