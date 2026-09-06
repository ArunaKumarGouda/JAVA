public class Aru_72_Array_Max_Value {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 8, 3};
        int ans = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
