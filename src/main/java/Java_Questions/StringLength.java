package Java_Questions;

public class StringLength {

    public static void main(String[] args) {

        String str = "Hello World";

        // Way - 01
        System.out.println("String Length: " + str.length());

        // Way - 02

        int len = 0;

        for (int i = 0; i < str.length(); i++) {
            len++;
        }

        System.out.println("String Length: " + len);


        // Way - 03

        char[] character = str.toCharArray();
        int len1 = 0;
        for(char ch : character){
            len1++;
        }

        System.out.println("String Length: " + len1);





    }
}
