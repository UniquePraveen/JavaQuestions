package Java_Questions;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        char[] character = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                character[i] = '*';
            }
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.print(character[i]);
        }


    }
}
