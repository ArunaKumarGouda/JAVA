// You are given an integer array nums where the largest integer is unique.
//Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

public class Aru_116_Largest_Number_At_Least_Twice_of_Others {
    static int dominantIndex(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for(int i = 0; i < n; i++) {
            if(i != index) {
                int twice = nums[i] * 2;
                if(twice > max) {
                    return -1;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 0};
        int ans = dominantIndex(arr);
        System.out.println(ans);
    }
}
