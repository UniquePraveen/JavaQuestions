package Java_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindAndRemoveDuplicatesInArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10};

        ArrayList<Integer> DuplicateList = removeDuplicates(nums);
        System.out.println("Duplicate List: " + DuplicateList);

        ArrayList<Integer> nonDuplication = removeDuplicates(nums);
        System.out.println("Non Duplication List: " + nonDuplication);

        HashSet<Integer> remove = removeDuplicate(nums);
        System.out.println("Remove Duplication List: " + remove);

        int[] temp = WithOutHashSet(nums);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }


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

    // WithoutHash
    public static int[] WithOutHashSet(int[] nums) {

        int j = 0;

        // Temporary array to store unique elements
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] is already present in temp
            for (int k = 0; k < j; k++) {
                if (nums[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not duplicate, add to temp
            if (!isDuplicate) {
                temp[j] = nums[i];
                j++;
            }
        }

        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }

        return result;


    }
}
