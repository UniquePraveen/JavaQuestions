package Java_Questions;

import java.sql.SQLOutput;

public class FibonnaciSeries {

    public static void main(String[] args) {

        int f = 0;
        int s = 1;


        System.out.println(f);
        System.out.println(s);

        for (int i = 1; i <= 10; i++) {

            int a = f + s;
            System.out.println(a);
            f = s;
            s = a;



        }


    }
}
