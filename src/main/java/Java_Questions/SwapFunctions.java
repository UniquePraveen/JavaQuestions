package Java_Questions;

public class SwapFunctions {


    public static void main(String[] args) {
        // Way - 01 using temp variable
        int a = 10;
        int b = 20;
//
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // Way - 02 using built-in function
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // Way - 03 using built-in function
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // Way - 04 using multiple and Division
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
