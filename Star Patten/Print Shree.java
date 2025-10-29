
import java.util.Scanner;
public class logical_Operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one odd number : ");
        int n = sc.nextInt();
        System.out.println("Your number is : " + n);
        int mid=(n/2+1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               if(i==mid || j==mid || (i==1 && mid<=j) || (i==n && j<=mid) || (j == n && mid <= i) || (j == 1 && mid >= i)) {
                System.out.print("*");
               }
               else {
                System.out.print(" ");
               }
               }
               System.out.println( );
        }
        sc.close();
    }
}
