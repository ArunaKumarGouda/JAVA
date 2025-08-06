import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        int a = sc.nextInt();
        
        System.out.println("Enter number 2 :");
        int b = sc.nextInt();

        int c = a + b;
        System.out.println(c);
    }
}
