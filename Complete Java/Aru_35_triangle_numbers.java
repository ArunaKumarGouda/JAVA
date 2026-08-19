import java.util.Scanner;

public class Aru_35_triangle_numbers {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 1;

        System.out.println(i);
        do {
            i++;
            sum += i;
            System.out.println(sum);
        }
        while (i <= n);

        sc.close();
    }
}

