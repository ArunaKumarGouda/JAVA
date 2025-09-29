public class Arrayproblems {
   static void addAnArray(){

        int[] arr = {4, 5, 7, 9, 2};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of array elements are :" + sum); 
    }
  public static void main(String[] args) {
        addAnArray();
  }
}
