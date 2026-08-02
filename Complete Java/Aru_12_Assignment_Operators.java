// Assignment operator are used to assign or update the value of a variable.

public class Aru_12_Assignment_Operators {
    public static void main(String[] args) {
        int p = 10;
        int q;

        // = operator
        q = p;
        System.out.println(q); // 10

        // += operator
        p += q; // p = p + q
        System.out.println(p); // 20

        // -= operator
        p -= q; // p = p - q
        System.out.println(p); // 10

        // *= operator
        p *= q; // p = p * q
        System.out.println(p); // 100

        // /= operator
        p /= q; // p = p / q
        System.out.println(p); // 10
    }
}
