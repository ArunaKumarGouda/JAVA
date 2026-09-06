public class Aru_71_Sum_of_Elements_in_Array {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
