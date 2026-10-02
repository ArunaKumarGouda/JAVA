// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

public class Aru_120_Single_Number {
    static int singleNumber(int[] nums) {
        int n = nums.length;

//        int number = 0;
//        for(int i = 0; i < n; i++) {
//            number ^= nums[i];
//        }
//
//        return number;

        for(int i = 0; i < n; i++) {
            boolean single = true;
            for(int j = 0; j < n; j++) {
                if(i != j && nums[i] == nums[j]) {
                    single = false;
                    break;
                }
            }

            if(single) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 2};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
}
