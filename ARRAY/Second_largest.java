class Second_largest {
    public static int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            }else if(num > secondMax && num != max){
                secondMax = num;
            }
        }
        return secondMax == Integer.MIN_VALUE ? -1 :secondMax;
    }
    public static void main(String[] args){
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 5, 10};
        int[] arr3 = {1, 1, 1, 1};
        
        System.out.println(getSecondLargest(arr1));
        System.out.println(getSecondLargest(arr2));
        System.out.println(getSecondLargest(arr3));
    }
}
