package Raj;

class Mainclasss
{
    void show()
    {
        System.out.println("show method");
    }
    public static void main (String args [])
    {
        Mainclasss m=new Mainclasss();
        calculator c=new calculator();
        c.subtract(20,5);
        c.multiply(12,3);
        c.divide(12,4 );
        c.power(2 , 3);
        m.show();
    }
}
