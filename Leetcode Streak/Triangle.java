import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        // Start from second last row and go upwards
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int down = triangle.get(i + 1).get(j);
                int diagonal = triangle.get(i + 1).get(j + 1);
                int curr = triangle.get(i).get(j) + Math.min(down, diagonal);
                triangle.get(i).set(j, curr); // update in place
            }
        }
        
        // top element has the answer
        return triangle.get(0).get(0);
    }
    
    // Example test
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3,4));
        triangle.add(Arrays.asList(6,5,7));
        triangle.add(Arrays.asList(4,1,8,3));
        
        System.out.println(sol.minimumTotal(triangle)); 
        // Output: 11 (2 + 3 + 5 + 1)
    }
}
