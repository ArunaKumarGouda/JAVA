public class ArrayPairSum {

    static int pairSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] + arr[j] == target){
                    ans++; 
                }
             }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 8, 6, 1};
        int target = 7;
        int ans2 = pairSum(arr, target);
        System.out.println(ans2);
    }
}
