package com.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0,b = 1,result = 0;
        System.out.println("The fibonacci series is : ");
        System.out.println(a);
        while(result < 30) {
            result = a + b;
            a = b;
            b = result;
            System.out.println(+ result);
        }
    }
}
