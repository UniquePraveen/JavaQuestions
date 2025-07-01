package Java_Questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int Num = sc.nextInt();

        int rev = 0;

        // Way - 01
        while (Num > 0) {


            System.out.print(Num % 10);

            Num = Num / 10;


        }

//        System.out.println(rev);

        // Way - 02


    }
}
