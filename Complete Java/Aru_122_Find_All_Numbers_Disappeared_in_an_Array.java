//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.List;
import java.util.ArrayList;

public class Aru_122_Find_All_Numbers_Disappeared_in_an_Array {
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        List<Integer> list = new ArrayList<>();

        for(int check = 1; check <= n; check++) {
            boolean found = false;
            for(int i = 0; i < n; i++) {
                if(nums[i] == check) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                list.add(check);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = findDisappearedNumbers(arr);
        System.out.println(list);
    }
}
