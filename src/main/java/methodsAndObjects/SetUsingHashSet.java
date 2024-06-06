package methodsAndObjects;

import java.util.HashSet;
import java.util.Set;

public class SetUsingHashSet {
    public static void main(String args[]) {
        Set<Integer> num = new HashSet<>();
        num.add(34);
        num.add(55);
        num.add(54);
        num.add(12);
        num.add(90);
        num.add(34);

        // it will not add any duplicates to array. it is not in structured format
        for(int n: num)
        {
            System.out.println(n);
        }
    }
}
