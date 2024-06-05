

package methodsAndObjects;

class parent{
    int rate ;
    static String name;
    String company;
    public void show()
    {
        System.out.println(company+" : "+rate+" : "+name);
    }
}
public class staticVariable {
    public static void main(String args[])
    {
        parent p1 = new parent();
        p1.company="Apple";
        p1.rate = 24000;
        parent.name= "Smartphone";
        parent p2 = new parent();
        p2.company="Samsung";
        p2.rate = 45000;
        parent.name= "phone";
        p1.show();
        p2.show();
    }
}


