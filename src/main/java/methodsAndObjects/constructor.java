package methodsAndObjects;

class Human
{
    int age;
    String name;

    public Human() {
        age=10;
        name="Lakshmi";
        System.out.println("I am in Default constructor");
    }
    public Human(int age, String name)
    {
        this.age = age;
        this.name= name;
        System.out.println(age +" :" +name);
    }
    public int getAge()
    {
       return age;
    }
    public String getname()
    {
        return name;
    }
}
public class constructor {
    public static void main(String args[])
    {
        Human hu = new Human();
        Human hu1 = new Human(20, "kumari");
        System.out.println("This is from main class "+hu1.getAge()+":"+hu1.getname());

    }
}
