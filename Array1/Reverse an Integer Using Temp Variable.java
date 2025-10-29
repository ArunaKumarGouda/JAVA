

//Given 2 integer a and b. Swap the 2 given values temp variable.

public class Reverse_an_Integer2 {
    static void swapWithTemp(int a, int b){

        System.out.println("value before swapping :");
        System.out.println("a :" + a);
        System.out.println("b :" + b);

        int temp = a;
        
        a = b;
        b = temp;

        System.out.println("value after swapping :");
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }

    public static void main(String[] args) {

    int a = 4;
    int b = 7;
    swapWithTemp(a, b);
    }
}
