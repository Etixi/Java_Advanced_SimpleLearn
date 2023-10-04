package com.etienne.annotations;

import java.lang.reflect.Method;

public class Myclass {
    @MyCustomAnnotation(value = 10)
    public void sayHello(){
        System.out.println("my custom annotation");
    }

    public static void main(String[] args) throws Exception{
        Myclass h = new Myclass();
        Method methodval = h.getClass().getMethod("sayHello");
        MyCustomAnnotation myCustomAnnotation = methodval.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is : " + myCustomAnnotation.value());
    }
}
