package com.printUsingLoop;



public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[] = {1, 2 ,3,4 ,5};
        int result=0;
        int i =0;
        while( i<=4)
        {result= result +array[i];
        i++;
        }
        System.out.println("the average is:" +result);

    }
}
