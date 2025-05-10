package Java_Questions;

import java.util.Scanner;

public class StringDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        char[] charArray = str.toCharArray();

        int total = 0;


        for (int i = 0; i < charArray.length; i++) {

            if (Character.isDigit(charArray[i])) {

                total += Character.getNumericValue(charArray[i]);
            }
        }

        System.out.println("Sum of present digit: " + total);

    }
}
