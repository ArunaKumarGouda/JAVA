// Find the count Occurrence of an element x in a given array.

public class Aru_78_Count_Occurrences {
    static int occurrence(int[] arr, int x) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 67, 4, 2, 4, 3, 3};
        int x = 3;

        int ans = occurrence(arr, x);
        System.out.println("count of x: " + ans);

//        int count = 0;
//        for(int i = 0; i < arr. length; i++) {
//            if(arr[i] == x) {
//                count++;
//            }
//        }
//        System.out.println(count);


    }
}
