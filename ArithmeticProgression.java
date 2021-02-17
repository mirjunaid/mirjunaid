package com.arithmetic;
import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int i, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms of the arithmetic progression to be printed:");
        int n = scan.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the starting term of the required progression:");
        int a = in.nextInt();
        Scanner ib = new Scanner(System.in);
        System.out.println("Enter the common difference:");
        int cd = ib.nextInt();
        System.out.println("the required arithmetic progression is:");
        System.out.println(+a);
        for (i=0;i<=n;i++){
            result = a + cd;
            a = result;
            System.out.println(+result);
        }

    }
}
