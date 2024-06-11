package ServiceNow;

import java.util.*;

public class MergeLists {
    public static void main(String args[])
    {
        Integer [] num1 = {2,4,6,7,8};
        Integer [] num2 = {4,8,77,99,89,90};
        ArrayList<Integer> num1array = new ArrayList<>(Arrays.asList(num1));
        ArrayList<Integer> num2Array = new ArrayList<>(Arrays.asList(num2));
        ArrayList<Integer> num3Array = new ArrayList<>();
        num3Array.addAll(num1array);
        num3Array.addAll(num2Array);
        System.out.println(num3Array);


    }
}
