/*abstract class A6
{
    abstract void show();

}
class D6 extends A6
{                                
    public void show()
    {
        System.out.println("Hello show");            // note 
    }
    public void Display()
    {
        System.out.println("Hello Display");
    }
}
class C6
{
    public static void main(String args[])
    {
        A6 d=new D6();
        d.Display();    // not the method of A6  / show not able to run
        d.show();
    }
}


abstract class A6
{
    abstract void show();

}
class D6 extends A6
{                                
    public void show()
    {
        System.out.println("Hello show");            // note 
    }
    public void Display()
    {
        System.out.println("Hello Display");
    }
}
class C6
{
    public static void main(String args[])
    {
        A6 d=new D6();
        d.show();
    }
}
*/

interface A6
{

}
interface C6 extends A6{
    
}


