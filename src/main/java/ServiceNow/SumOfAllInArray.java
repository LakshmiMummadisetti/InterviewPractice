package ServiceNow;

public class SumOfAllInArray {
    public static void main(String args[])
    {
        int[] nums ={10,20,30,40};
        int j = 0;
        for(int i : nums)
        {
            j = j+i;
        }
        System.out.println(j);
    }
}
