class Problem{
static void sortedArray(){

        boolean check = true;
        int[] arr = {1, 2, 3, 4};

        for (int i = 1; i < arr.length; i++) {
          if (arr[i] < arr[i - 1]){
            check = false;
            break;
            }
        }
        System.out.println(check);
    }  
public static void main(String[] args) {
        sortedArray();
}
}
