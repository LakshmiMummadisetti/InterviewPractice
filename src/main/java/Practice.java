class First{
    private int age;
    private String name;
    private String company;

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String getCompany()
    {
        return company;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
 this.name=name;
    }
    public void setCompany(String company)
    {
this.company=company;
    }
    public void details(int age, String name, String company)
    {
System.out.println(age + name + company);

    }
    public void First(int age,String name)
    {
        System.out.println(age+name);
    }

}
public class Practice {

    public static void main(String args[])
    {
        First obj = new First();
        obj.setAge(99);
        obj.setName("Lakshmi");
        obj.setCompany("IBM");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getCompany());
        obj.details(34,"Sai", "Servicenow");
        obj.First(10,"Chervik");
    }
}
