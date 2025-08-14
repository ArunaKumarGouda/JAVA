// User function Template for Java
import java.util.Scanner;

class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i -1];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        int maxProfit = solution.maximumProfit(prices);
        System.out.println(maxProfit);
        scanner.close();
    }
}
