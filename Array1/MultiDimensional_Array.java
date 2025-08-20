class MultiArr {
    public void show() {
        int[][] ages = new int[2][3];
        ages[0][0] = 45;
        ages[0][1] = 65;
        ages[0][2] = 48;
        ages[1][0] = 124;
        ages[1][1] = 4;
        ages[1][2] = 75;

        System.out.println(ages[0][0]);
        System.out.println(ages[0][1]);
        System.out.println(ages[0][2]);
        System.out.println(ages[1][0]);
        System.out.println(ages[1][1]);
        System.out.println(ages[1][2]);
    }
}


public class MultiDimensional_Arrays {
    public static void main(String[] args) {
        MultiArr m = new MultiArr();
        m.show();
    }
}
