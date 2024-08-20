package forloopprograms;

import java.util.Scanner;

public class squareroot {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
int num = input.nextInt();
int power = input.nextInt();
//        int num = 2;
     //   int power = 5;
        int result=1;
        for(int i=1;i<=power;i++)
        {
            result= result*num;
        }
        System.out.println(result);
    }
}
