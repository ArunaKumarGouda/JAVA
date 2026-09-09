// Find the last occurrence of an element x in a given array;

public class Aru_79_Last_Occurrences {
    static int lastOccurrrence(int[] arr, int x) {
        int ans = 0;
        for(int i = 0; i < arr. length; i++) {
            if(arr[i] == x) {
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 2, 5, 4};
        int x = 5;
        System.out.println(lastOccurrrence(arr, x));
    }
}
