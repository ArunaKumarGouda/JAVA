import java.util.Scanner;

public class MaxElementCallByReference {

    static void maxArray(){
        int[] arr = {12, 45, 78, 79, 24};
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > ans) {
            ans = arr[i];
        }
    }
    System.out.println("The maxArray is :" + ans);
}
    


    void maxArray1(){
        int[] arr = {12, 45, 78, 79, 24};
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > ans) {
            ans = arr[i];
        }
    }
    System.out.println("The maxArray1 is :" + ans);
}

    static int maxArray2(int[] arr, int n){
        int ans = 0;

        for (int i = 0; i < n; i++) {
        if (arr[i] > ans) {
            ans = arr[i];
        }
    }
    return ans;    
}

    static int maxArray3(int[] arr, int n){
        int ans = arr[0];

        for (int i = 0; i < n; i++) {
        if (arr[i] > ans) {
            ans = arr[i];
        }
    }
    return ans;    
}

    
    public static void main(String[] args) {
        MaxElementCallByReference m = new MaxElementCallByReference();
        maxArray();
        m.maxArray1();

        int[] arr = {12, 45, 78, 79, 24};
        int n = arr.length;
        int maximunElement = maxArray2(arr, n);
        System.out.println("The maxArray2 is :" + maximunElement);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Length :");
        int b = sc.nextInt();

        int[] arr1 = new int[b];

        System.out.println("Enter " + b+ " Numbers :");
        for (int i = 0; i < b; i++){
            arr1[i] = sc.nextInt();
        }

        int maximunElement2 = maxArray3(arr1, b);
        System.out.println("The maxArray2 is :" + maximunElement2);
        sc.close();
    }
}
