package Java_Questions;

public class PrintEvenAndOddNumber {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 51, 61, 70, 80, 99, 100};

        System.out.println("EvenNumbers: ");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("OddNumbers: ");
        for(int i : array){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
