package Java_Questions;

public class Palindrome {

    public static void main(String[] args) {

        String name = "amma";
        String reversed = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }

        if (name.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
