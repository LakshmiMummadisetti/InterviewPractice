public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(Solution(11));
        System.out.println(Solution(15));
        System.out.println(Solution(87));
        System.out.println(Solution(14));
        System.out.println(Solution(99));
        System.out.println(Solution(1));
    }
    public static boolean Solution(int num)
    {
        if(num==1 || num==0)
            return false;
        for(int i = 2; i<=num;i++)
        {
            if(num%i ==0)
            {System.out.println("This is not a prime number");
                break;

            }
            else
                return true;
        }
        return true;
    }
}
