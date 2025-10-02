import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int target, int k, int start, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        // Base case: if target is 0 and we used k numbers, it's a valid combination
        if (target == 0 && path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        // If we go over the target or exceed the number of elements, stop
        if (target < 0 || path.size() > k) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            path.add(i);
            backtrack(target - i, k, i + 1, path, result);  // move to next number
            path.remove(path.size() - 1);  // backtrack
        }
    }
}
