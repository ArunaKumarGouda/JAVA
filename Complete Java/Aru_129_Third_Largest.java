import java.util.List;
import java.util.ArrayList;

public class Aru_129_Third_Largest {
    static int thirdLargest(List<Integer> arr) {
        // code here
        int n = arr.size();

        if(n < 3) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) > largest) {
                largest = arr.get(i);
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr.get(i) == largest) {
                arr.set(i, Integer.MIN_VALUE);
                break;
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) > secondLargest) {
                secondLargest = arr.get(i);
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr.get(i) == secondLargest) {
                arr.set(i, Integer.MIN_VALUE);
                break;
            }
        }

        int thirdLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) > thirdLargest) {
                thirdLargest = arr.get(i);
            }
        }

        return thirdLargest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        List<Integer> list = new ArrayList<>();

        int n = arr.length;
        for(int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        int ans = thirdLargest(list);
        System.out.println(ans);
    }
}
