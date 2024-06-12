package LeetCodePrograms;

public class SumOfTwoNUmberWithoutUsingArith {
    public static void main(String args[])
    {
    int result = sum(12,30);
    System.out.println(result);
    }
    public static int sum(int a, int b)
    {
        for(int i=1;i<=b;i++)
        {
            a++;
        }
        return a;
    }
}
