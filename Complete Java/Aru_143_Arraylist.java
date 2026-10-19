import java.util.ArrayList;

public class Aru_143_Arraylist {
    public static void main(String[] args) {
        // Wrapper class
        Integer n = Integer.valueOf(4);
        System.out.println(n);

        Float f = Float.valueOf(2.45f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element into the array list
        l1.add(5);
        l1.add(2);
        l1.add(6);
        l1.add(7);

        // get an element at index i
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));

        // print with for loop
        for(int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        // printing the array list directly
        System.out.println(l1);

        // adding element at some index i
        l1.add(1, 100);
        System.out.println(l1);

        // modifying element at index i
        l1.set(2, 10);
        System.out.println(l1);

        // removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        // removing an element e
        boolean a = l1.remove(Integer.valueOf(7));
        System.out.println(a);
        boolean b = l1.remove(Integer.valueOf(70));  // don't give error
        System.out.println(b);
        System.out.println(l1);

        // checking if an element exist
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);
    }
}
