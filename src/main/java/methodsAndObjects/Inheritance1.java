package methodsAndObjects;


class Parent1{
    public void show()
    {
        System.out.println("This is parent show");
    }
}
class Child1 extends Parent1{
    public void show()
    {
        System.out.println("This is overriden show");
    }
    public void show1()
    {
        System.out.println("This is child show1");
    }
}

public class Inheritance1 {
    public static void main(String args[]){
        Child1 ch = new Child1();
        ch.show();

    }
}
