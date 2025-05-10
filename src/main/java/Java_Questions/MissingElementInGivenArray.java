package Java_Questions;

public class MissingElementInGivenArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum of given Array: " + sum);


        for(int i = 1; i <= 10; i++){

            sum1 += i;

        }

        System.out.println("Sum of Array: " + sum1);


        System.out.println("Missing Element: " + (sum1 - sum));
    }
}
