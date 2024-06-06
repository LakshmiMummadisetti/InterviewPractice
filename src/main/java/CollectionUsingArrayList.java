import java.util.ArrayList;
import java.util.Collection;

public class CollectionUsingArrayList {
    public static void main(String args[])
    {
        Collection obj = new ArrayList<>();
        obj.add(5);
        obj.add(7);
        obj.add(8);
        System.out.println(obj);
        Collection<Integer> obj1 = new ArrayList(); //collection doesn't support index. but list suorts the index
        obj1.add(9);
        obj1.add(12);
        obj1.add(15);
        obj1.add(92);

        for(int n:obj1)
            System.out.println(n);

    }
}
