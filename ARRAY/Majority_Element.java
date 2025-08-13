import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        if (arr.length == 0) return result;
        
        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;
        
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            }else if (num == candidate2) {
                count2++;
            }else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        
        count1 = 0; count2 = 0;
        for (int num : arr) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }
        
        int n = arr.length;
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3 && candidate1 != candidate2) result.add(candidate2);
        
        Collections.sort(result);
        return result;
    }
    
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        System.out.println(solution.findMajority(arr));
    }
}
