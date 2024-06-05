public class evenorodd {
    public static void main(String args[])
    {
        int i = 10;
        String result1 ="even";
        String result2 = "odd";
        if(i%2==0)
        {
            System.out.println("it is even");
        }
        else
            System.out.println("it is odd");

        // another way using ternary operator
        String result = i%2==0 ? result1:result2;
        System.out.println("This result is from ternary operator"+result);


    }

}
