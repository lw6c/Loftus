package test;

import java.util.*;

public class Test {

    public static void main(String[] args) {


        // no int and int diff casting
        System.out.println((Math.random() * 6) + 1);
        System.out.println((int) (Math.random() * 6) + 1);


        System.out.println((int) (Math.random() * 6) + 1);
        System.out.println((int) (Math.random() * 6) + 1);
        System.out.println((int) (Math.random() * 6) + 1);
        System.out.println((int) (Math.random() * 6) + 1);
        System.out.println((int) (Math.random() * 6) + 1);
        System.out.println((int) (Math.random() * 6) + 1);

        System.out.println((int) (Math.random() * 60) + 1);
        System.out.println((int) (Math.random() * 60) + 1);
        System.out.println((int) (Math.random() * 60) + 1);
        System.out.println((int) (Math.random() * 60) + 1);
        System.out.println((int) (Math.random() * 60) + 1);
        System.out.println((int) (Math.random() * 60) + 1);
        System.out.println((int) (Math.random() * 60) + 1);
        System.out.println((int) (Math.random() * 60) + 1);


        System.out.println("********************************************************************************");
        Random r = new Random();
        int Low = 1000; //inclusive
        int High = 10000; //exclusive

        for (int i = 0; i < 500; i++) {
            int Result = r.nextInt(High - Low) + Low;

            //alt no need for Random()
            //int Result = (int) (Math.random() * (High - Low)) + Low;
            System.out.println(Result);

        }
    }
}


