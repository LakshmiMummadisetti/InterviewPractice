package forloopprograms;

import java.util.*;

public class MergetwoLists {
    public static void main(String args[])
    {
        List<Integer> one = new ArrayList<>();
        one.add(1);
        one.add(3);
        one.add(1);
        one.add(4);
        one.add(2);
        one.add(3);
        System.out.println(one);
        Collections.sort(one);
        System.out.println(one);
        List<Integer> two = new ArrayList<>();
        two.add(8);
        two.add(9);
        two.add(8);
        two.add(4);
        two.add(2);
        two.add(10);
        System.out.println(two);
        Collections.sort(two);
        System.out.println(two);
        List<Integer> merged = new ArrayList<>();
        merged.addAll(one);
        merged.addAll(two);
        System.out.println(merged);
        Collections.sort(merged);
        System.out.println(merged);
        Set<Integer> removedup = new HashSet<>();
        removedup.addAll(merged);

        removedup.remove(4);
        System.out.println(removedup);
    }
}
