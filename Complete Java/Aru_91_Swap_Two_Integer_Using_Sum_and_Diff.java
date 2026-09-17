public class Aru_91_Swap_Two_Integer_Using_Sum_and_Diff {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
