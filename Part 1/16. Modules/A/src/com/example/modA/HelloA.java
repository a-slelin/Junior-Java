package com.example.modA;

public class HelloA {
    public String greet() {
        return "Hello from Module A!";
    }

    // Этот метод не является public, но доступен через reflection из moduleB, т.к. moduleA - открытый.
    String internalGreeting() {
        return "Internal greeting from Module A";
    }
}
