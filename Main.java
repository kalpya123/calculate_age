package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("calculate your current  age ");
        Scanner myvar=new Scanner(System.in);
        System.out.println("please enter birthyear");
        int inputmyyear=myvar.nextInt();


        int result =2019-inputmyyear;
        System.out.println("here is your age  "+result);


        if(18<result)//20<18
        {
            System.out.println(" congratulations you 18+ "+" and age is "+result);

        }
        else
        {
            System.out.println("sorry your under 18 "+" and age is  "+result);
        }

        System.out.println("thanks program has been closed successfully");
    }
    }

