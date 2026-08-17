// Find the sum of the following series
// s = 1 - 2 + 3 - 4 ... n

import java.util.Scanner;
public class Aru_32_Sum_of_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans -= i;
            }
            else {
                ans += i;
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
