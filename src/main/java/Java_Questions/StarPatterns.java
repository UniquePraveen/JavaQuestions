package Java_Questions;

public class StarPatterns {

    public static void main(String[] args) {

        int p = 0;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                p++;
                System.out.print(p + " ");
            }

            System.out.println();
        }
    }
}
