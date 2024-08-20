package forloopprograms;

import java.util.Arrays;

public class starprogram {
    public static void main(String args[])
    {
      System.out.println(Arrays.toString(solution(7)));
    }
    public static int[] solution(int num)
    {
        int first =0;
        int second =1;
        int third;
        int num1[] = new int[22];
        num1[0]= first;
        num1[1] =second;
        for(int i =1;i<=num;i++)
        {
            third=first+second;
            num1[i]=third;

            first=second;
            second=third;


        }
        return num1;
    }
}
