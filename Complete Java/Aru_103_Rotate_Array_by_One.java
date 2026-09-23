public class Aru_103_Rotate_Array_by_One {
    static void rotate(int[] arr) {
        // code here
        int n = arr.length;

        for(int i = n - 1; i > 0; i--) {
            int j = i - 1;
            if(i > j) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
