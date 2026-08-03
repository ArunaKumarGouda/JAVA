// Unary operators are operators that perform an operation on a single operand (one variable or value).

public class Aru_13_Unary_Operator {
    public static void main(String[] args) {
        int p = 5, q = 5;

        System.out.println(p++);
        System.out.println(p);

        System.out.println(++q);
        System.out.println(q);

        int x = p++;
        int y = ++q;

        System.out.println(x);
        System.out.println(y);

        System.out.println(p);
        System.out.println(q);
    }
}
