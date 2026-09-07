public class Aru_73_Return_Index_of_Array {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 6, 3, 7, 4};
        int x = 3;
        int ans = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                ans = i;
                break;
            }
        }
        if(ans == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Found " + x + " at index " + ans);
        }
    }
}
