package methodsAndObjects;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetusingTreeSet {
    public static void main(String args[]) {
        Set<Integer> num = new TreeSet<>();
        num.add(34);
        num.add(55);
        num.add(54);
        num.add(12);
        num.add(90);
        num.add(34);

        // it will not add any duplicates to array. it is in ordered/structured format
        for(int n: num)
        {
            System.out.println(n);
        }
        //using iterator

        Iterator<Integer> n = num.iterator();
        while(n.hasNext())
        System.out.println("Thi is using iterator:" +n.next());
    }
}
