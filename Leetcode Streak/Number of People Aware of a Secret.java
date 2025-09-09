class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1000000007;
        long[] dp = new long[n + 1]; // dp[i] = number of people who learn secret on day i
        dp[1] = 1;  // On day 1, one person knows the secret

        long sharing = 0; // number of people who can share the secret

        for (int day = 2; day <= n; day++) {
            // People start sharing after 'delay' days
            if (day - delay >= 1) {
                sharing = (sharing + dp[day - delay]) % MOD;
            }

            // People forget the secret after 'forget' days
            if (day - forget >= 1) {
                sharing = (sharing - dp[day - forget] + MOD) % MOD;
            }

            // People who learn secret on this day
            dp[day] = sharing;
        }

        // Count all people who still remember secret on day n
        long ans = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i >= 1) ans = (ans + dp[i]) % MOD;
        }
        return (int) ans;
    }
}
