// Bitwise operators are used to perform operations directly on the binary bits of integer values.

public class Aru_14_Bitwise_Operator {
    public static void main(String[] args) {

        int a = 9, b = 10;

        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(~a);     // ~n = -(n + 1)
        System.out.println(a << 2); // n << k = n * 2^k
        System.out.println(a >> 2); // n >> k = n / 2^k
    }
}
