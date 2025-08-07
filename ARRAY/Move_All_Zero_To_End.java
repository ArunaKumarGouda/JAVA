class Move_All_Zero_To_End {
    public static void pushZerosToEnd(int[] arr) {
        // code here
        int nonZeroIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        printArray(arr);
    }
}
