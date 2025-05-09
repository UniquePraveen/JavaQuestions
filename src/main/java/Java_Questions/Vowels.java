package Java_Questions;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                charArray[i] = '*';
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }

    }
}
