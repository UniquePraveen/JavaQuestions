package Java_Questions;

public class ReverseString {

    public static void main(String[] args) {

//        // Using CharAt() method to reverse the string
//
        String str = "Hello World";
//
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }

        // Using toCharArray() method to reverse the string

        char[] ch = str.toCharArray();
        int l = ch.length;

        for (int i = l - 1; i >= 0; i--) {
            System.out.println(ch[i]);
        }

        //     StringBuzzer class to reverse the string

        StringBuffer SB = new StringBuffer(str);
        System.out.println(SB.reverse());

        // Append
        SB.append(" I'm Praveen");

        System.out.println(SB);


    }
}
