package Java_Questions;

public class FibonnaciSeries {

    public static void main(String[] args) {

        int f = 0;
        int s = 1;


        for (int i = 0; i < 8; i++) {

            System.out.print(f + " ");

            int t = f+s;

            f = s;
            s = t;


        }

    }
}
