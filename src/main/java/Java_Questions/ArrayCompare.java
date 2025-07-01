package Java_Questions;

import java.util.Arrays;

public class ArrayCompare {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] array_2 = {10, 20, 30, 40, 50, 60, 70, 80, 100, 90};

        Arrays.sort(array);
        Arrays.sort(array_2);
        if (array.length != array_2.length) {
            System.out.println("Arrays are not the same");
        } else {

            boolean value = Arrays.equals(array, array_2);

            System.out.println(value);
//
//            if (value =='true') {
//
//                System.out.println("Arrays are the same");
//            } else {
//                System.out.println("Arrays are not the same");
//            }


        }
    }


}
