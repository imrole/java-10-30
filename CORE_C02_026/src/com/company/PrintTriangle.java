package com.company;

public class PrintTriangle {
    public static void main(String[] args) {
        int num=5;
        for(int i = 0; i < num ; i++)
        {
            for(int a = 0 ; a < num-i-1 ; a++)
            {
                System.out.print(" ");
            }
            for(int a = 0 ; a < 2*i+1 ; a++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
