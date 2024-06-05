package methodsAndObjects;

class car
{
    public void enginee()
    {
        System.out.println("This is enginee from Car class");
    }
}
public class AnanamousInnerClass {
    public static void main(String args[]) {
        car obj = new car() {
            public void enginee() {
                System.out.println("This is enginee from Main class");
            }
        };
        obj.enginee();
    }
}
