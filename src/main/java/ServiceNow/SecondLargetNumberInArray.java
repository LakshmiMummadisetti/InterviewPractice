package ServiceNow;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargetNumberInArray {
    public static void main(String[] args)
    {
        Integer[] nums = {12,4,565,77,1,122,324};
        ArrayList<Integer> sear = new ArrayList(Arrays.asList(nums));
        Collections.sort(sear);
        for(Integer i :sear)
        {
            System.out.println(i);
        }
        int size = sear.size();
//        System.out.println(sear.size-1());
        System.out.println(sear.get(size-2));
    }
}
