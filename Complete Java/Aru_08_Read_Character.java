import java.util.Scanner;

public class Aru_08_Read_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter one string : ");
        char ch1 = sc.nextLine().charAt(0);
        System.out.println("The first character in this string is : " + ch1);

        System.out.println("Enter one string which is minimum three character : ");
        char ch2 = sc.nextLine().charAt(2);
        System.out.println("The third character in this string is : " + ch2);

        sc.close();
    }
}
