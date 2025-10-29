 
import java.util.Scanner;

public class ae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word which is made of 5 vowels (a, e, i, o, u): ");
        String ch = sc.nextLine().toLowerCase();

        int countEven = 0;
        int countOdd = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char v : vowels) {
            int count = 0;
            for (int i = 0; i < ch.length(); i++) {
                if (ch.charAt(i) == v) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Even number of vowels: " + countEven);
        System.out.println("Odd number of vowels: " + countOdd);

        sc.close();
    }
}
