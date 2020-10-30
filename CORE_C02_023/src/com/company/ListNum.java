package com.company;

import java.util.Random;

public class ListNum {
    public static void main(String[] args) {
        //赋初值
        int []a=new int[10];
        Random random = new Random();
        for(int i=0;i<a.length;i++)
        {
            a[i]=random.nextInt(100);
        }
        //排序
        for(int n = 0 ;n<a.length;n++)
        {
            for(int b=n;b<10;b++)
            {
                if(a[n]>a[b])
                {
                    int m = a[n];
                    a[n]=a[b];
                    a[b]=m;
                }
            }
        }
        //打印
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
