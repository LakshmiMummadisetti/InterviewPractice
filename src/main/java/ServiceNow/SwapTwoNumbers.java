package ServiceNow;

public class SwapTwoNumbers {
    public static void main(String args[])
    {
        int x= 10;
        int y =20;
        x = x+y; //30
        y= x-y; //10
        x=x-y;//20
        System.out.println("X is:" + x +"  Y is :" +y );
    }
}
