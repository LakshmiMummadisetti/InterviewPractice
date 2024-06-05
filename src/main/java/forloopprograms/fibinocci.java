package forloopprograms;

public class fibinocci {
    public static void main(String args[])
    {
        int first = 0;
        int second = 1;
        int num = 10;
        int third =0;
        System.out.println(first);
        System.out.println(second);
        for(int i=0;i<num;i++)
        {
            third = first+second;
            System.out.println(third);
            first=second;
            second=third;

        }

    }
}
