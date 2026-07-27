import java.util.Scanner;

public class Aru_07_AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Age Calculator :- ");

        System.out.println("Enter current day(DD) : ");
        int current_day = sc.nextInt();

        System.out.println("Enter current month(MM) : ");
        int current_month = sc.nextInt();

        System.out.println("Enter current year(YYYY) : ");
        int current_year = sc.nextInt();

        System.out.println("Enter old day(DD) : ");
        int old_day = sc.nextInt();

        System.out.println("Enter old month(MM) : ");
        int old_month = sc.nextInt();

        System.out.println("Enter old year(YYYY) : ");
        int old_year = sc.nextInt();

        System.out.println("Your age is : ");

        int total_day;
        if (current_day > old_day) {
            total_day = current_day - old_day;
            System.out.println("Day : " + total_day);
        }
        else {
            current_day = current_day + 30;
            total_day = current_day - old_day;
            System.out.println("Day : " + total_day);
            current_month = current_month - 1;
        }

        int total_month;
        if(current_month > old_month) {
            total_month = current_month - old_month;
            System.out.println("Month : " + total_month);
        }
        else {
            current_month = current_month + 12;
            total_month = current_month - old_month;
            System.out.println("Month : " + total_month);
            current_year = current_year - 1;
        }

        int total_year = current_year - old_year;
        System.out.println("Year : " + total_year);

        sc.close();
    }
}
