import java.util.Scanner;

public class Aru_62_Decimal_to_Binary_Number_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number: ");
        int decimal_Number = sc.nextInt();

        int ans = 0;
        int pw = 1;

        while(decimal_Number > 0) {
            int parity = decimal_Number % 2;
            ans += (parity * pw);
            pw *= 10;
            decimal_Number /= 2;
        }
        System.out.println(ans);

        sc.close();
    }
}
