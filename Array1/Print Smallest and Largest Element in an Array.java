import java.util.Arrays;

public class Problem {

    static void smallestAndLargestElement(){
        int[] arr = {45, 2, 78, 357, 65};
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Smallest : " + arr[0]);
        System.out.println("Largest : " + arr[arr.length - 1]);
    }
  public static void main(String[] args){
    smallestAndLargestElement();
  }
}
