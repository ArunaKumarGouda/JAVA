import java.util.*;

class Solution {
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        
        // start with "1"
        q.add("1");
        
        for (int i = 0; i < n; i++) {
            String curr = q.poll();    // take front element
            result.add(curr);          // add to result
            
            // generate next two binary numbers
            q.add(curr + "0");
            q.add(curr + "1");
        }
        
        return result;
    }
    
    // main for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.generateBinary(5)); 
        // Output: [1, 10, 11, 100, 101]
    }
}
