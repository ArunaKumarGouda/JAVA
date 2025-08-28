class Problem{
static void returnIndex() {
        int[] arr1 = {475, 8, 62, 45, 62};

        int x = 62;
        int ans = -1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == x) {
                ans = i;
                break;
            }
        }
        System.out.println("The index no. of 62 is :" + ans);
    }
  public static void main(String[] args) {
        returnIndex();
  }
}
