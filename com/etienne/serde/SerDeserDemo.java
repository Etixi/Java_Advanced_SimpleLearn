package com.etienne.serde;

import java.io.*;

public class SerDeserDemo {
    public static void main(String[] args) {

        Student student = new Student("John", 25, "23 East, California");
        student.setX(10);

        String filename = "com/etienne/serde/Test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        // Serialization
        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialize : \n" + student);

        } catch (IOException e) {
            System.out.println("IOException is caught");
        }

        // Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;

        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();
            System.out.println("Object has been deserialized : \n" + object);
            System.out.println("the deserialized value of x is: \n" + object.getX());

            objIn.close();
            fileIn.close();
        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException" + " is caught");
        }

    }
}
