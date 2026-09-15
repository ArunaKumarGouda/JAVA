// Given an array 'a' consisting of integer. Return the first value that is repeating in this array. If no value is being repeated, return -1.

public class Aru_87_First_Repeating_Element {
    static int repeatingElement(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 6, 3, 4};
        System.out.println("First repeated element is: " + repeatingElement(arr));
    }
}
