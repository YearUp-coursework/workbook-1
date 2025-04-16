package com.pluralsight;

public class MethodsExample {
    public static void main(String[] args) {

        foo();
        moo();
        moo();
        foo();
    }

    public static void moo(){
        System.out.println("Moo 1");
        System.out.println("Moo 2");
        System.out.println("Moo 3");
    }

    public static void  foo(){
        System.out.println("Foo 1");
        System.out.println("Foo 2");
        System.out.println("Foo 3");
    }

}
