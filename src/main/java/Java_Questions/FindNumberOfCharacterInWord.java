package Java_Questions;

import java.util.Locale;
import java.util.Scanner;

public class FindNumberOfCharacterInWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String str = sc.nextLine();
//        str = str.toLowerCase();
//        int count = 0;
//
//
//        char a;
//
//        for(int i = 0; i < str.length(); i++){
//
//            if(str.charAt(i) == 'a'){
//                count++;
//            }
//
//        }
//
//        System.out.println(count);

        // Way - 02 without iteration

        char toFind = 'a';

        str = str.toUpperCase();

       String find = Character.toString(toFind).toUpperCase();

        System.out.println(str.length());

       str = str.replaceAll(find, "");

        System.out.println(str.length());



    }
}
