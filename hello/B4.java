/*Excess modifiers

Excess modifier are keyword in java that control the visibility access ability of classes ,method ,variables;

Types of excess modifiers
[1]=private
[2]=Default
[3]=protected
[4]=Public

# private excess modifier

A private member is excessable only within the same class

# Default excess modifier 
if know excess modifier is specified java usses default excess ececlalble only within the same package 

# Protected Excess modifier

A protected member is eccisable 
*inside the same class
*with in the same pakages 

#public Excess modifier

public member is excesable in anywhere


class A4
{
    private int a=10;
    int b= 20;
    void Display()
    {
        System.out.println(a);
    }
}
class B4 extends A4{
    void show()
    {
        System.out.println(b);
    }
    public static void main(String args[])
    {
        B4 m=new B4();
        m.show();
        m.Display();
    }
}

_______________________________________________________________*/


class A4
{
    private int a=10;
    int b= 20;
    int c=30;
    void Display()
    {
        System.out.println(a);
    }
    private void Output()
    {
      System.out.println(c);
    }
}
class B4 extends A4{
    void show()
    {
        System.out.println(b);
    }
    public static void main(String args[])
    {
        B4 m=new B4();
        m.show();
        m.Display();
        m.Output();    // Cann.t excess
    }
}