// Write a program to sort an ArrayList of Strings in decreasing order.

import java.util.ArrayList;
import java.util.Collections;

public class Aru_145_Sort_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(6);
        list.add(30);
        list.add(5);
        list.add(10);
        System.out.println("Original list: " + list);
        Collections.sort(list);
        System.out.println("Ascending order: " + list);
//        Collections.sort(list, Collections.reverseOrder());
        list.sort(Collections.reverseOrder());
        System.out.println("Descending order: " + list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Welcome");
        list1.add("To");
        list1.add("Aruna");
        list1.add("Wallah");
        System.out.println("OG: " + list1);
        Collections.sort(list1);
        System.out.println("Sorted Order: " + list1);
//        Collections.sort(list1, Collections.reverseOrder());
        list1.sort(Collections.reverseOrder());
        System.out.println("Reverse Order: " + list1);
    }
}



