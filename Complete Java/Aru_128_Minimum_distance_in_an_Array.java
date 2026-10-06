public class Aru_128_Minimum_distance_in_an_Array {
    static int minDist(int arr[], int x, int y) {
        // code here
        int n = arr.length;

        boolean foundX = false;
        int indexX = -1;

        boolean foundY = false;
        int indexY = -1;

        int distance = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                foundX = true;
                indexX = i;
            }

            if(arr[i] == y) {
                foundY = true;
                indexY = i;
            }

            if(indexX != -1 && indexY != -1) {
                int currentDistance;
                if(indexX < indexY) {
                    currentDistance = indexY - indexX;
                }
                else {
                    currentDistance = indexX - indexY;
                }

                if(currentDistance < distance) {
                    distance = currentDistance;
                }
            }
        }

        if(!foundX) {
            return -1;
        }

        if(!foundY) {
            return -1;
        }

        return distance;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int x = 2;
        int y = 1;
        int ans = minDist(arr, x, y);
        System.out.println(ans);
    }
}
