package Java_Questions;

public class CountOfDigit {

    public static void main(String[] args) {

        int num = 123456789;

        int count = 0;

        while (num > 0) {

            num = num / 10;
            count++;
        }

        System.out.println("Number of Digit: " + count);


    }
}
