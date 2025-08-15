package Java_Questions;

import java.util.LinkedList;

public class linkedList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        for (String s : linkedList) {
            System.out.println(s);
        }

        linkedList.add(null);
        linkedList.remove("d");

        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
