package methodsAndObjects;

abstract class  Calc {
    public abstract void math();
}

public class AbstractMethodAnanamousInnerClass {
    public static void main(String args[])
    {
        Calc c = new Calc()
        {
            public void math()
            {
                System.out.println("This is implementation of abstarct methos using ananamous inner class");
            }
        };

    c.math();
    }
}
