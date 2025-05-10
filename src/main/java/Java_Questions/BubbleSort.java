package Java_Questions;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {101, 201, 30, 40, 500, 60, 710, 810, 90, 1};

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
