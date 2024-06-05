package methodsAndObjects;

public class multipleMethods {
    public static void main(String args[])
    {
        int a =22;
        int b=15;

        //creating a object for computer class
        computer com = new computer();
        // Calling one method from computer class which has no return but performs the actions
        com.notreturn();
        //calling the method which has return type
        int result = com.multi(a,b);
        //the return value from multi method will not print unless we store it in some variable.
        System.out.println(result);
        //calling the another method whose return time is string
        String str = com.getMeaPen(a);
        System.out.println(str);

    }
}
// This is just class and class name. It is not allowing the public or private before that.
class computer
{
    //This is void method and doesnot return anything and perform the actions
    //if give return, then it throws error.
    public void notreturn()
    {
        int a =10;
        System.out.println("This is void method and doesnot return anything and perform the action");
    }
    //this method is int return one
    public int multi(int num1,int num2)
    {
     return num1*num2;
    }
    public String getMeaPen(int a)
    {
       if(a>20)
           return "the pen is available";

       return "the pen is not available";
    }

}
