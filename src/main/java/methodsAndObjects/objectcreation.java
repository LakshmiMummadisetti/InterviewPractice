package methodsAndObjects;

public class objectcreation {
    public static void main(String args[])
    {
        int num1 = 10;
        int num2 = 20;
        addition ad = new addition(); // there is not be variables in side of it.
       int result = ad.add(num1,num2);
        System.out.println(result);
    }
}
class addition
    // it should not be public or private
{
    public int add(int num1,int num2)
    {
        //int re = num1+num2;
        return num1+num2; //if it is not a void method, then need to give return
    }
}
