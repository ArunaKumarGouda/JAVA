class Problem{
static void sortedArray1(){
        int[] arr = {45, 12, 78, 35, 98};
        Arrays.sort(arr);
        System.out.println("The sorted array is :");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
public static void main(String[] args){
    sortedArray1();
}
}
