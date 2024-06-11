package ServiceNow;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SameElementsInArray {
    public static void main(String args[]) {
        Integer[] num1 = {1, 2, 3, 4};
        Integer[] num2 = {1, 2, 3, 4, 6};
        System.out.println(result1(num1, num2));

    }
    public static boolean result1(Integer[] array1, Integer[] array2)
    {
        Set<Integer> arr1 = new HashSet<>(Arrays.asList(array1));
        Set<Integer> arr2 = new HashSet<>(Arrays.asList(array2));
        return arr1.equals(arr2);
    }

}
