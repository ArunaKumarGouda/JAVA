public class Aru_70_Traversing_Through_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{325, 5, 23}, {23, 53, 6}};

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }

        System.out.println("Another form");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
