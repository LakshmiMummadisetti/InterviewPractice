import java.util.ArrayList;
import java.util.List;

public class ListUsingArrayList {
    public static void main(String args[])
    {
        List<Integer> obj = new ArrayList<>();
        obj.add(23);
        obj.add(93);
        obj.add(94);
        obj.add(93);
        obj.add(92);
        System.out.println("using index "+obj.get(3));
        obj.set(3,88);
        System.out.println("using index "+obj.get(3));
        for(int n:obj)
        {
            System.out.println(n + "index of" +obj.indexOf(n));
        }

    }
}
