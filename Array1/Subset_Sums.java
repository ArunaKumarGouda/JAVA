// User function Template for Java//User function Template for Java
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        backtrack(0, 0, arr, result);
        Collections.sort(result);
        return result;
    }
    
    private void backtrack(int index, int currentSum, int[] arr, ArrayList<Integer> result) {
        if (index == arr.length) {
            result.add(currentSum);
            return;
        }
        backtrack(index + 1, currentSum + arr[index], arr, result);
        backtrack(index + 1, currentSum, arr, result);
    }
}
