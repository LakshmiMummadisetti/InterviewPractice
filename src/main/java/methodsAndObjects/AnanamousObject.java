package methodsAndObjects;
class A{
    public A()
    {
        System.out.println("This is default A constructor");
    }
    public int A(int a, int b)
    {
        return a+b;
    }
}
class B extends A
{

    public B() {

        System.out.println("This is default B constructor");
    }
    public void show()
    {
        System.out.println("This is B method show");
    }
}


public class AnanamousObject{
    public static void main(String args[])
    {

        // below is the way of creating the Ananamous objects.
        new B().A(12,23);
        new B().show();
    }
}
