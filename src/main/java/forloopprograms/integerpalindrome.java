package forloopprograms;

public class integerpalindrome {
    public static void main(String args[])
    {
 int mainnum = 789;
 int rev = 0;
 while(mainnum!=0)
 {
     rev= mainnum%10+rev*10; //9 //8
             mainnum=mainnum/10;
 }
 System.out.println(rev);

    }
}
