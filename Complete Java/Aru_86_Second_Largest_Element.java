// Find the second-largest element in the given array.

public class Aru_86_Second_Largest_Element {
    static int secondLargest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] == largest){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {9, 8, 9, 6, 11, 5, 8};
        System.out.println("The second largest element is: " + secondLargest(arr));
    }
}
