package ServiceNow;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseListedList {
    public static void main(String args[])
    {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(9);
        li.add(8);
        li.add(3);
        li.add(4);
        li.add(5);
        Iterator<Integer> it = li.descendingIterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
