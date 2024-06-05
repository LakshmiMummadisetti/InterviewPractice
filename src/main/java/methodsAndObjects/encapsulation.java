package methodsAndObjects;

public class encapsulation {
    public static void main(String args[])
    {
        encap obj = new encap();

       obj.setAge(77);
       obj.setName("kumari");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
class encap{
    private int age;
    private String name;

    public void setAge(int a)
    {
         age=a;
    }
    public void setName(String n)
    {
        name=n;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
