

//Given 2 integer a and b. Swap the 2 given values using sum and difference method.

public class Reverse_an_Integer1 {
    static void swapWithoutTemp(int a, int b){
        System.out.println("Value before swapping :");
        System.out.println("a :" + a);
        System.out.println("b :" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value after swapping :");
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }
    public static void main(String[] args) {

        swapWithoutTemp(5, 8);
        
    }
}
