package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GiveCommonElements {
    public static void main(String args[])
    {
        List<Integer> li1 = new ArrayList<>();
        li1.addAll(Arrays.asList(1,2,3,4,53,3,3,4,5));
        List<Integer> li2 = new ArrayList<>();
        li2.addAll(Arrays.asList(9,6,7,8,8,4,53,3,3,4,5));
//        Collections.sort(li1);
//        Collections.sort(li2);
      //  li2.removeAll(li1); // remove the matching data in li2
        li2.retainAll(li1); // giving matches data only
System.out.println(li1);
        System.out.println(li2);
    }
}
