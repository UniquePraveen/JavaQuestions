package OOPS;

public class Class {

    public Class(int a, int b) {
        System.out.println(a+b);
    }

    public Class() {
    }

    public static int print(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }

    public static void main(String[] args) {

        Class a = new Class(10, 20);
        print(10, 20);
    }
}
