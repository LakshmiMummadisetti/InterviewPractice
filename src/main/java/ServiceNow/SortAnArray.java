package ServiceNow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAnArray {
    public static void main(String args[])
    {
        //using Arrays
        int nums[] = {9,0,-2,-3,-4,5,6,2};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        //using collections
        List<Integer> in = new ArrayList<>();
        in.add(-9);
        in.add(3);
        in.add(2);
        in.add(12);
        in.add(-3);
        Collections.sort(in);
        System.out.println(in);
    }
}
