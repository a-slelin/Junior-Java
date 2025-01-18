package com.example.modB;

import com.example.modA.HelloA;

import java.lang.reflect.Method;

public class HelloB {
    public static void main(String[] args) throws Exception {
        HelloA helloA = new HelloA();
        System.out.println(helloA.greet()); // Доступ к public методу

        // Доступ к не-public методу через reflection (возможен, т.к. moduleA - открытый)
        Method internalMethod = HelloA.class.getDeclaredMethod("internalGreeting");
        internalMethod.setAccessible(true);
        String internalGreeting = (String) internalMethod.invoke(helloA);
        System.out.println(internalGreeting);
    }
}
