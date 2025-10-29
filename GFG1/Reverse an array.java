class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i]; 
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
