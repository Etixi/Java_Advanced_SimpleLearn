package com.etienne.encapsulation;

public class EncapsulationDemo {

    public static void main(String[] args){
        int i =1;
        //int result = changeValue(i);
        //System.out.println("i is : " + result);

        Student john = new Student("John", 25, "23 East, California");
        //changeNameInSameObject(john);
        //Student resultObj = changeNameInDiffObject(john);
        //System.out.println(resultObj.getName());
        System.out.println(john.getName());
        System.out.println(john.getAddress());
    }

    /*
    private static int changeValue(int i){
        i = i + 1;
        return i;
    }

     */
}
