package Java_Questions;

public class CountEvenAndOddDigitNumber {

    public static void main(String[] args) {

        int num = 123456789;

        int odd = 0;
        int even = 0;

        while (num != 0) {

            int Num = num % 10;

            if (Num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num / 10;

        }

        System.out.println("Even Number: " + even);
        System.out.println("Odd Number: " + odd);

    }
}
