package methodsAndObjects;

interface X{
    int comp = 199;
    void age();
    void name();
}
interface Y extends X
{
    void sum();
}
interface Z
{
    void mul();
}
class Demo1 implements X,Z{
    public void age()
    {
        System.out.println("I am Age in multiple interface");
    }
    public void name()
    {
        System.out.println("I am name multiple interface");
    }
    public void mul()
    {
        System.out.println("I am multiple interface");
    }
}
class Demo implements Y{
    public void age()
    {
       System.out.println("I am Age");
    }
    public void name()
    {
        System.out.println("I am name");
    }
    public void sum()
    {
        System.out.println("I am sum");
    }


}
public class InterfaceClass {
    public static void main(String args[])
    {
        X obj1 = new Demo1();
        obj1.age();
        Z obj2 = new Demo1();
        obj2.mul();
        Y obj3 = new Demo();
        obj3.sum();
        obj3.age();
        obj3.name();
    }
}
