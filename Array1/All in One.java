
import java.util.Scanner;
import java.util.Arrays;

public class Arun {

    static void maxArray(int[] arr, int n){
        int max = 0;

        System.out.print("The array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element of this array is : " + max);
    }

    static int minArray(){
        int[] arr = {4, 54, 44, 2, 57, 34, 15};
        int n = arr.length;
        int min = arr[0];

        System.out.print("The array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < n; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    void indexOfAnElement(){
        int[] arr = {4, 54, 44, 57, 34, 15};
        int n = arr.length;
        int target = 34;
        int index = 0;

        System.out.print("The array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            if (arr[i] == target){
                index = i;
            }
        }
        System.out.println("The index number of " + target + " is : " + index);
    }

    int lastOccuranceIndex(){
        int[] arr = {4, 4, 3, 3, 57, 3, 15, 3, 2};
        int n = arr.length;
        int target = 3;
        int count = 0;

        System.out.print("the array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("The target is : " + target);

        for (int i = 0; i < n; i++){
            if (arr[i] == target){             
                count++;
            }
        }
        System.out.println("The count occurances is : " + count);

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count = i;
            }
        }
        System.out.println("The last occurances index is : " + count);

        for (int i = 0; i < n; i++) {
            if (arr[i] == target){          
                count = i;
                break;
            }
        }
        System.out.print("The fast occurances index is : ");
        return count;

    }

    static void sortedOrNot(int[] arr){
        int n = arr.length;
        int x = arr[0];
        boolean y = true;

        System.out.print("the array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            if (arr[i] < x){
                y = false;
            }
        }

        if(y){
            System.out.println("The array is sorted...");
            System.out.println("the minimum element of this array is : " + arr[0] + " and also");
            System.out.println("The maximum element is : " + arr[n - 1]);
        }
        else {
            System.out.println("The array is not sorted...");
        }
    }

    static void sort_an_array() {
        int[] arr = {45, 84, 2, 21, 78, 4};
        int n = arr.length;

        System.out.print("Array before sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr);

        System.out.print("Array after sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void numberOfElementGreaterThenX(){
        int[] arr = {1, 2, 6, 3, 4, 5};
        int n = arr.length;
        int target = 2;
        int count = 0;
        
        for (int i = 0; i < n; i++){
            if (arr[i] > target){
                count++;
            }
        }
        
        System.out.print("The array elements are : ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.println("The number of elements greater then " + target + " in this array is : " + count);
    }
    
    static void pairSum(){
        int[] arr = {1, 2, 6, 3, 4, 5};
        int n = arr.length;
        int target = 8;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }

        System.out.print("The array elements are : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println();

        System.out.println("The target is : " + target);
        System.out.println("The number of pair sum of these array is : " + count);
    }

    static void tripletsSum(){
        int[] arr = {5, 2, 3, 6, 1, 7};
        int n = arr.length;
        int target = 10;
        int count = 0;

        System.out.print("the array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                      count++;   
                    }
                }
            }
        }
        System.out.println("The target is : " + target);
        System.out.println("The triplets sum if this array is : " + count);
    }

    static void secondLargest() {
        // Declare an array
        int[] arr = {5, 3, 2, 6, 1, 8, 4};
        int n = arr.length;

        // Print the array
        System.out.print("The array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Find maximum element
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Update maximum element to minimum element
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        // Find second maximum element
        int secondMax = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        // Update second maximum element to minimum element
        for (int i = 0; i < n; i++) {
            if (arr[i] == secondMax) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        // Find third maximum element
        int thirdMax = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > thirdMax) {
                thirdMax = arr[i];
            }
        }

        // Print the result
        System.out.println("The first largest element of this array is : " + max);          // Output: 8
        System.out.println("The second largest element of this array is : " + secondMax);   // Output: 6
        System.out.println("The third largest element of this array is : " + thirdMax);     // Output: 5
    }

    static void swapTwoIntegerUsingTempVariable(){
        int a = 5;
        int b = 8;

        System.out.println("Before swapping the element : ");
        System.out.println("a :" + a);
        System.out.println("b :" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping the element : ");
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }

    static void uniqueNumber(){
        int[] arr = {1, 2, 1, 2, 4, 5, 5};
        int n = arr.length;
        int num = 0;

        System.out.print("The array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] != arr[j]) {
                    num = arr[i];
                }
            }
        }
        System.out.println("The unique element of this array is : " + num);
    }

    static void swapTwoIntegerUsingAddAndDiffMethod() {
        int a = 5;
        int b = 8;

        System.out.println("Before swapping the element : ");
        System.out.println("a :" + a);
        System.out.println("b :" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping the element : ");
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }

    static void reverseAnArray(){
        int[] arr = {4, 7, 3, 1, 8};
        int n = arr.length;

        System.out.print("Array before reversing : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // for (int i = 1; i < n; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[i - 1];
        //     arr[i - 1] = temp;
        // }
        
        System.out.print("Array after reversing : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void addAnArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int sum = 0;

        System.out.print("the array are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of these array elements are : " + sum);
    }

    static void rotateAnArrayKTimes(){
        int[] arr = {4, 7, 3, 1, 8};
        int n = arr.length;
        int k = 3;
        k = k % n;

        System.out.println("Rotate an array 2 times...");
        System.out.print("Array before rotating : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        k = k % n;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }
        
        System.out.print("Array after rotating : ");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);              // Using Scanner class
        
        System.out.print("Enter array length : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxArray(arr, n);

        sc.close();
        System.out.println();

        System.out.println("The minimum element of this array is : " + minArray());           // Using non-return type( int data type)       
        System.out.println();

        Arun a = new Arun();                      // Creating Object
        a.indexOfAnElement();
        System.out.println();

        Arun q = new Arun();                      // Using non-return type( int data type) and also Creating Object
        int arr2 = q.lastOccuranceIndex();
        System.out.println(arr2);
        System.out.println();

        int[] arr3 = {3, 3, 4, 4, 57, 100};
        sortedOrNot(arr3);
        System.out.println();

        sort_an_array();
        System.out.println();

        numberOfElementGreaterThenX();
        System.out.println();

        pairSum();
        System.out.println();

        tripletsSum();
        System.out.println();

        secondLargest();
        System.out.println();

        swapTwoIntegerUsingTempVariable();
        System.out.println();

        uniqueNumber();
        System.out.println();

        swapTwoIntegerUsingAddAndDiffMethod();
        System.out.println();

        reverseAnArray();
        System.out.println();

        addAnArray();
        System.out.println();

        rotateAnArrayKTimes();
        System.out.println();
    }
}
