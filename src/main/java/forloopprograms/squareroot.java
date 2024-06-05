package forloopprograms;

public class squareroot {
    public static void main(String args[])
    {
        int num = 2;
        int power = 5;
        int result=1;
        for(int i=1;i<=power;i++)
        {
            result= result*num;
        }
        System.out.println(result);
    }
}
