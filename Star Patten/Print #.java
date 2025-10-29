
import java.util.Scanner;
public class logical_Operator {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("Enter one number which is greater then or equal to 8 : ");
    int n = sc.nextInt();

    int x = (n - 2 ) / 3 ;
    int p , q  = 0 ;
    int a = 0;
    int b = 0;
    int y = 3 * x + 2;
 
        if (n == y){
            p = x + 1;
            q = n - x;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if ((i == p || j == q) || (i == q || j == p)) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                }
            }
            System.out.println();
        }    
    }
    else{
        a = 3;
        b = n - 2;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if ((i == a || j == b) || (i == b || j == 3)) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    sc.close();

    }
}
