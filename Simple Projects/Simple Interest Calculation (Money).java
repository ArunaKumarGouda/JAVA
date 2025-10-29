
import java.util.Scanner;

public class money_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle amount : ");
        int principle = sc.nextInt();

        System.out.print("Enter rate of interest per anum(%) : ");
        int rate = sc.nextInt();

        System.out.print("Enter duration of years : ");
        int years = sc.nextInt();

        int a = years * 12;

        System.out.print("Enter duration of months : ");
        int months = sc.nextInt();

        System.out.print("Enter duration of days : ");
        int days = sc.nextInt();

        float b = days / 30f;

        float c = a + months + b;
        System.out.println("Your total duration of month is : " + c);

        float d = principle * rate * c;

        float e = d / 100;
        System.out.println("Your simple interest is : " + e);

        float f = e / c;
        System.out.println("Your Simple Interest Rate Increase Monthly : " + f);
        
        float g = e + principle;
        System.out.println("You pay total amount : " + g);

        sc.close();
    }
}
