class Problem{
static void secondMax() {
        int[] arr = {12, 45, 8, 46, 456};
        int ans = 0;
        System.out.println("The length is :" + arr.length);

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j < arr.length; j++) {
                if (arr[i] > arr[i - 1]) {
                    ans = arr[i - 1];
                }
            }
        }
        System.out.println("The second max element are :" + ans);
    }
public static void main(String[] args) {
        secondMax();
}
}
