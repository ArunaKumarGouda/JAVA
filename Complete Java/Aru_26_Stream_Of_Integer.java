// Print the sum of the stream of integers in the input.

import java.util.Scanner;

public class Aru_26_Stream_Of_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != -1) {
            sum += num;
            num = sc.nextInt();
        }
        System.out.println(sum);

//        do{
//            sum += num;
//            num = sc.nextInt();
//        } while (num != -1);
//        System.out.println(sum);

        sc.close();
    }
}
