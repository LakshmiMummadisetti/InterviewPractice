package ServiceNow;

interface A {
    void sum();
}
interface B
{
    void mul();

}
interface C extends  A,B
{
    void div();
}
