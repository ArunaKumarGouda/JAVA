import java.util.Scanner;

public class Aru_146_n_Natural_Number_Using_Recursion {
    static void printNaturalNumber(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }

        printNaturalNumber(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Natural Number: ");
        int n = sc.nextInt();
        printNaturalNumber(n);

        sc.close();
    }
}
