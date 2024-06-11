package ServiceNow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndSuffleAnArray {
    public static void main(String args[])
    {
        //using Arrays
        Integer nums[] = {9,0,-2,-3,-4,5,6,2};

        Arrays.sort(nums);
        //using collections
        List<Integer> in = new ArrayList<>(Arrays.asList(nums));
        in.add(-9);
        in.add(3);
        in.add(2);
        in.add(12);
        in.add(-3);
        Collections.sort(in);
        System.out.println(in);
        Collections.shuffle(in);
        System.out.println(in);
    }
}
