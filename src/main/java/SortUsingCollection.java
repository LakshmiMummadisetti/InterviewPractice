import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {
    public static void main(String args[])
    {
        List<Integer> in = new ArrayList<>();
        in.add(76);
        in.add(12);
        in.add(11);
        in.add(72);
        in.add(11);
        in.add(33);
        //sorting using collections
       Collections.sort(in);
        System.out.println(in);
    }
}
