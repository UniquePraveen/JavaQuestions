package Java_Questions;

public class LargestNumber {

    public static void main(String[] args) {

        int a = 100000;
        int b = 2000000;
        int c = 300000000;

        // Way  - 01

//        int max = a;
//        int min = a;
//
//
//        if (b > max) {
//            if (b > c) {
//                max = b;
//            } else {
//                max = c;
//            }
//        } else if (c > max) {
//            max = c;
//        }
//
//
//        System.out.println("MAX is: " + max);

        // Way - 02

        int largest = a > b ? a : b;
        int largest2 = largest > c ? largest : c;

        System.out.println("Max is: " + largest2);

    }
}
