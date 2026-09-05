class ArrayExample {
    void demoArray() {
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = {"Aruna", "Himanshu", "Rahul"};

        ages[0] = 18;
        ages[1] = 19;
        ages[2] = 20;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        weights[0] = 60.1f;
        weights[1] = 23.5f;
        weights[2] = 32.2f;

        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
    void twoD_Array() {
        int[][] arr = {{12, 43, 56}, {23, 554, 67}, {645, 7, 24}};

//        int[][] arr_1 = new int[3][3];

//        int[][][] arr_1 = new int[3][3][3];   // 3D array

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }
}

public class Aru_67_Array_Example {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArray();
        obj.twoD_Array();
    }
}
