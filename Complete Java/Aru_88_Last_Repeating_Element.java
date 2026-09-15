// Given an array 'a' consisting of integer. Return the last value that is repeating in this array. If no value is being repeated, return -1.

public class Aru_88_Last_Repeating_Element {
    static int lastRepeatingElement(int[] arr) {
        int n = arr.length;
        int lastRepeatingElement = -1;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    lastRepeatingElement = arr[i];
                }
            }
        }
        return lastRepeatingElement;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 6, 3, 4, 6};
        System.out.println("Last repeated element is: " + lastRepeatingElement(arr));
    }
}
