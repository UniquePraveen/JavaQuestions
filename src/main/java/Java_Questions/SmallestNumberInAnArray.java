package Java_Questions;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInAnArray {

    public static void main(String[] args) {

        Integer arr[] = {2, 5, 8, 9, 23, 2, 1, 46, 0};
//        int min = arr[0];

    // Way - 01

//        for (int i = 1; i < arr.length; i++) {
//
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//
//        System.out.println(min);
//
//
//        // Way - 02 Sorting
//
//        Arrays.sort(arr);
//
//        System.out.println(arr[0]);

        // Way - 03

       List<Integer> list =  Arrays.asList(arr);
       Collections.sort(list);
       System.out.println(list.get(0));


    }
}
