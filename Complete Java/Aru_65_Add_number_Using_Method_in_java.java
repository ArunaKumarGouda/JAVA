import java.util.Scanner;

class Algebra {
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class Aru_65_Add_number_Using_Method_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Algebra c = new Algebra();

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Sum of input numbers is: ");
        int ans = c.add(a, b);
        System.out.println(ans);
    sc.close();
    }
}
