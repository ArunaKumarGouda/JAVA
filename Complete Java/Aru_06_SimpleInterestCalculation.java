import java.util.Scanner;

public class Aru_06_SimpleInterestCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Interest Calculator: ");

        System.out.println("Enter your principal amount : ");
        float principal = sc.nextFloat();

        System.out.println("Enter your rate : ");
        float rate = sc.nextFloat();

        System.out.println("How many year : ");
        int yr = sc.nextInt();

        System.out.println("How many month : ");
        int month = sc.nextInt();

        System.out.println("How many days : ");
        int d = sc.nextInt();

        int year = yr * 12;
        float day = d / 30f;

        float time = year + month + day;
        System.out.println("Total time : " + time + " month");

        float simple_Interest = (principal * rate * time) / 100f;
        float monthly_Increase = simple_Interest / time;
        System.out.println("Monthly simple rate increase : " + monthly_Increase);
        System.out.println("Total simple interest : " + simple_Interest);

        float total_Amount = principal + simple_Interest;
        System.out.println("You pay total amount : " + total_Amount);

        sc.close();
    }
}
