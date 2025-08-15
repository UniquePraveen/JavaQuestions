package Java_Questions;

public class StringJoin {

    public static void main(String[] args) {

        String[] str = {"Hello", "I'm", "Praveen"};

        String join = String.join(" ", str);

        System.out.println(join);

        // Way - 02 - String Buffer

        StringBuffer sb = new StringBuffer();

        for (String s : str) {
            sb.append(s);
            sb.append(" ");
        }

        System.out.println(sb);

        // Way - 03 - String Builder

        StringBuilder sb2 = new StringBuilder();
        for (String s : str) {
            sb2.append(s);
            sb2.append(" ");
        }

        System.out.println(sb2);

        // Way - 04 - String Concat

        String s = "";

        for (int i = 0; i < str.length; i++) {

            s += str[i];
            s += " ";
        }
        System.out.println(s);


    }
}
