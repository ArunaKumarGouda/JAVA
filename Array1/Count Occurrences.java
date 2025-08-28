class Problem{
static void countOccurrences(){
        int x = 4;
        int count = 0;

        int[] arr = {4, 4, 4, 5, 2};
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("The number of " + x + " elements in an array are :" +count);
    }
public static void main(String[] args) { 
        countOccurrences();
}
}
