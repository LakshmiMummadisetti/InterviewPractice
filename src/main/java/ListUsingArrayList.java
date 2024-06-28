import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUsingArrayList {
    public static void main(String args[])
    {
        Integer [] in = {3,4,5,6,7};
        List<Integer> obj = new ArrayList<>();
        obj.add(23);
        obj.add(93);
        obj.add(94);
        obj.add(93);
        obj.add(92);
        Collections.addAll(obj,in);
        System.out.println("using index "+obj.get(3));
        obj.set(3,88);
        System.out.println("using index "+obj.get(3));
        for(int n:obj)
        {
            System.out.println(n + "index of" +obj.indexOf(n));
        }

    }
}
