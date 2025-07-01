package Java_Questions;

import java.util.Scanner;

public class StringDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        char[] cha = str.toCharArray();

        System.out.println(cha);

        int total = 0;

        for (int i = 0; i < cha.length; i++) {

            if (Character.isDigit(cha[i])) {

                total += Character.getNumericValue(cha[i]);
            }

        }

        System.out.println("Total: " + total);
    }
}
