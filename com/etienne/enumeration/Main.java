package com.etienne.enumeration;


public class Main {
    public static void  main(String[] args){
       Color c1 = Color.RED;
       System.out.println("***************************************");
       System.out.println("Red Enum name : " + c1.name());
       System.out.println("Red Enum name : " + c1.getValue());
       System.out.println("***************************************");

       for(Color color : Color.values()){
           System.out.println("Enum value : " + color.getValue());
       }
    }
}
