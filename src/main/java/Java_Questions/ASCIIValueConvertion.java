package Java_Questions;

import java.util.Scanner;

public class ASCIIValueConvertion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        for (char c : ch) {
            System.out.println("Ascii Value of " + c + " is: " + (int)c);
        }



    }
}
