import java.util.*;

class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> map = new HashMap<>();
        for (int p : power)
            map.put(p, map.getOrDefault(p, 0L) + p);  // total damage for each power
        
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        
        int n = keys.size();
        long[] dp = new long[n];
        
        dp[0] = map.get(keys.get(0));
        
        for (int i = 1; i < n; i++) {
            long take = map.get(keys.get(i));
            
            // find previous non-conflicting spell
            int j = i - 1;
            while (j >= 0 && keys.get(j) >= keys.get(i) - 2) j--;
            if (j >= 0) take += dp[j];
            
            long skip = dp[i - 1];
            dp[i] = Math.max(skip, take);
        }
        
        return dp[n - 1];
    }
}
