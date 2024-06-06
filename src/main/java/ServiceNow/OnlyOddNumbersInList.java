package ServiceNow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//This checks the list has only odd numbers

public class OnlyOddNumbersInList {
    public static void main(String args[]) {
        List<Integer> li = new ArrayList<>();
        li.add(13);
        li.add(23);
        li.add(81);
        li.add(47);
        li.add(11);
        CheckOdd co = new CheckOdd();
        System.out.println(co.show(li));

    }
}
class CheckOdd {
    public boolean show(List<Integer> li) {
        for (int i : li) {
            if (i % 2 == 0)
                return false;

        }
        return true;
    }
}
