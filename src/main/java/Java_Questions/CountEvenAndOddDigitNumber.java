package Java_Questions;

public class CountEvenAndOddDigitNumber {

    public static void main(String[] args) {

        int num = 123456789;

        int odd = 0;
        int even = 0;

        while (num > 0) {

            int digit = num % 10;

            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            num = num / 10;

        }

        System.out.println("Even Digit: " + even);
        System.out.println("Odd Digit: " + odd);

    }
}
