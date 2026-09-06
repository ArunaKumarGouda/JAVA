public class Aru_69_Traversing_Through_the_Array {
    public static void main(String[] args) {
        int[] arr = {12, 5, 3, 65, 23, 6};

        for(int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Another format");
        for(int i = 0; i <= 5; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Another format");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Another format");
        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("using for each loop");
        for(int x: arr) {
            System.out.println(x);
        }

        System.out.println("Using while loop");
        int i = 0;
        while(i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }
}
