package methodsAndObjects;

public class samemethodnamewithdifferentvariables {
    public static void main(String args[])
    {
        float fl = 30.5f;
        int num2 = 20;
        int num3 =30;
        int num4 =40;
        samemethodNames obj = new samemethodNames();

        float value = obj.add(fl,num2);
        System.out.println(value);

        int intvalue = obj.add(num3,num4);
        System.out.println(intvalue);

        int addof3 = obj.add(num2, num3, num4);
        System.out.println(addof3);
    }
}
class samemethodNames
{
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
    public float add(float num1, int num2)
    {
        return num1+num2;
    }
    public int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
}
