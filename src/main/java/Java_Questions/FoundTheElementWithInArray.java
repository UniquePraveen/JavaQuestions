package Java_Questions;

public class FoundTheElementWithInArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int element = 10;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Element found at index: " + i);
                break;
            }
        }

    }
}
