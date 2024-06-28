package FreshWorks;

import java.util.Arrays;

public class SumOfTwo {
    public static void main(String args[]) {
        int[] i = {1, 2, 7, 4, 5, 6};
        int target = 11;
        Result re = new Result();
        int [] res = re.sumOfTwo(i, target);
            System.out.println(Arrays.toString(res));
    }
}

class Result
{
    public int[] sumOfTwo(int a[], int target)
    {
        for(int i = 0;i< a.length;i++)
        {
            for(int j =i+1;j<a.length;j++)
            {
                if(a[i] ==target-a[j])
                {
                    return new int[] {i,j};
                }

            }
        }
        return null;
    }
}
