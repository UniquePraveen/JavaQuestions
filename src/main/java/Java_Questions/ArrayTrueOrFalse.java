package Java_Questions;

import java.util.Arrays;

public class ArrayTrueOrFalse {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5, 5};
        boolean result = isTrueOrFalse(array1, array2);
        boolean results1 = isTrueOrFalse(array1, array2);

        System.out.println(result);
        System.out.println(results1);

    }

    // Without Iteration

    public static boolean isTrueOrFalse(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        } else {

            Arrays.sort(array1);
            Arrays.sort(array2);

            if (Arrays.equals(array1, array2)) {
                return true;
            } else {
                return false;
            }
        }
    }

    // Using Iteration

    public static boolean isTrueOrFalse1(int[] array1, int[] array2) {
        int count = 0;
        if (array1.length != array2.length) {
            return false;

        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    count++;
                }
            }
        }

        if(count == array1.length)
            return true;
        else
            return false;

    }
}
