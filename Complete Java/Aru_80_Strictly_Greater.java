// Count the number of element strictly greater than value of x.

public class Aru_80_Strictly_Greater {
    static void strictlyGreater(int[] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 30, 25, 15, 19, 21};
        int x = 20;
        strictlyGreater(arr, x);
    }
}
