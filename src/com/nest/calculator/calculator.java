package com.nest.calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int x,y,z,a;
        while(true)
        {
            System.out.println("select an option");
            System.out.println("1. Add");
            System.out.println("2. multiplication");
            System.out.println("3. substraction");
            System.out.println("4. division");
            System.out.println("5. exit");

            Scanner scanner=new Scanner(System.in);
            a=scanner.nextInt();
            System.out.println("Enter two numbers");
            x=scanner.nextInt();
            y=scanner.nextInt();

            switch(a)
            {
            case 1: z=x+y;

                System.out.println(z);
                break;

            case 2: z=x*y;

                System.out.println(z);
                break;

            case 3: z=x-y;

                System.out.println(z);
                break;

            case 4:z=x/y;

                System.out.println(z);
                break;

            case 5:
                System.exit(0);




        }
    }
}
}