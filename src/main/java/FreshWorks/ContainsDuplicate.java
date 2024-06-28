package FreshWorks;

public class ContainsDuplicate {
    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4, 6,88};
        CheckDuplicate cd = new CheckDuplicate();
       System.out.println( cd.containsSame(num));
    }
}

class CheckDuplicate
{
    public boolean containsSame(int[] num)
    {
            for(int i =0; i<num.length;i++)
            {
                for(int j =i+1;j<num.length;j++)
                {
                    if(num[i]==num[j])
                    {
                        return true;
                    }
                }
            }
            return false;
    }
}
