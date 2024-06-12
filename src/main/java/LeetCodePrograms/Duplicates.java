package LeetCodePrograms;

public class Duplicates {
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,5,6};
CheckDuplicates obj = new CheckDuplicates();
System.out.println(obj.duplicateValues(num));
        }
    }

class CheckDuplicates {
    public boolean duplicateValues(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }


            }
        }
        return false;
    }
}
