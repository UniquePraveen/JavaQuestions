package Java_Questions;

import java.util.ArrayList;
import java.util.HashSet;

public class FindAndRemoveDuplicatesInArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10};

//        ArrayList<Integer> DuplicateList = removeDuplicates(nums);
//        System.out.println("Duplicate List: " + DuplicateList);

        ArrayList<Integer> nonDuplication = removeDuplicates(nums);
        System.out.println("Non Duplication List: " + nonDuplication);

        HashSet<Integer> remove = removeDuplicate(nums);
        System.out.println("Remove Duplication List: " + remove);


    }


    public static ArrayList<Integer> removeDuplicates(int[] nums) {

        ArrayList<Integer> Duplicatelist = new ArrayList<>();
        ArrayList<Integer> nonDuplicatelist = new ArrayList<>();

        for (int num : nums) {
            if (!nonDuplicatelist.contains(num)) {
                nonDuplicatelist.add(num);
            } else {
                Duplicatelist.add(num);
            }
        }

        return nonDuplicatelist;
    }


    public static HashSet<Integer> removeDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return set;

    }
}
