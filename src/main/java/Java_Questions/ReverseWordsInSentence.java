package Java_Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInSentence {
    public static void main(String[] args) {

        String str = "Hello I'm Praveen";

        String[] split = str.split(" ");

        System.out.println(split.length);

        System.out.println(split[2]);

        String reverse = "";

        int len = 0;

// Way - 01

        for (int i = split.length - 1; i >= 0; i--) {
            reverse += split[i] + " ";
        }


        System.out.println(reverse);

// Way - 02

        List<String> list = Arrays.asList(split);
        Collections.reverse(list);


        System.out.println(list);

        String reverse1 = "";

        for (String str2 : list) {
            reverse1 += str2 + " ";

        }

        System.out.println(reverse1);


    }
}
