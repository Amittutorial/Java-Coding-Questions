abstract class Ab1
{
   abstract void show();

}
class Ab2 extends Ab1
{
    public void show()
    {
        System.out.println("Hello show");
    }
    void Display()
    {
        System.out.println("Hello Display");
    }
    public static void main(String args[])
    {
       Ab2 m= new Ab2();
       m.show();
       m.Display();  
    }
}  