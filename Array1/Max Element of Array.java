class Find_Max_Element{
  static void maxOfArray(){

    int[] nums = {751, 457, 125, 452, 785, 943};

    int ans = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > ans) {
            ans = nums[i];
        }
    }
    System.out.println("he minimum element of the array is :" + ans);
}
  public static void main(String[] args) {
        maxOfArray();
}
}
