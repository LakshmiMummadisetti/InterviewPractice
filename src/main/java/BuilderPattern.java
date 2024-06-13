import com.ibm.dtfj.javacore.builder.IBuilderData;

public class BuilderPattern {
public static void main(String args[]) {

    A.build().setB(4).setZ(10);
}
}
class A{
    private int z,b;
    public void show()
    {
     System.out.println("nothing");
    }
    public A setZ(int a)
    {
        this.z = a;
        return this;
    }
    public A setB(int b)
    {
        this.b = b;
        return this;

    }

    public static A build()
    {
        return new A();
    }
}
