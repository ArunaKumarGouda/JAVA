import java.util.ArrayList;
import java.util.Collections;

public class Aru_144_Swap_ArrayList {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(6);
        list.add(30);
        list.add(5);
        list.add(10);
        System.out.println("Original list: " + list);
//        reverseList(list);
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }
}
