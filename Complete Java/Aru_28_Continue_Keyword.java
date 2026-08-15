// Print all the values between 1 and 50 except for the multiple of 3.

public class Aru_28_Continue_Keyword {
    public static void main(String [] args) {

        for (int num = 1; num <= 50; num++) {
            if (num % 2 == 0) {
                continue;
            }
            System.out.println(num);
        }

//        int num = 1;
//
//        while (num <= 50) {
//            if(num % 3 == 0) {
//                num++;
//                continue;
//            }
//           System.out.println(num);
//            num++;
//        }

    }
}
