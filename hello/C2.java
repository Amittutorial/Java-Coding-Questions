/*class A2
{
    A2()
    {
      System.out.println("A2 constractor");
    }
}
class B2 extends A2
{
    B2()
    {   super();
         System.out.println("B2 constractor");
    }
}
class C2  extends B2
{
    C2()
    {  super();
        System.out.println("C2 is constractor");
    }
    
    public static void main(String args[])
    {
        C2 c=new C2();
    }
}

______________________________________________________________*/


class A2
{
    A2(int a)
    {
      System.out.println("A2 constractor value is--"+a);
    }
}
class B2 extends A2
{
    B2(String n)
    {    super(1000);
         System.out.println("B2 constractor value is--"+n);
    }
}
class C2  extends B2
{
    C2()
    {  super("Amit");
        System.out.println("C2 is constractor ");
    }
    
    public static void main(String args[])
    {
        C2 c=new C2();
    }
}

//_________________________________
 /*

#Rules of superkeyword

[1]==Super is must be 

[2]=this and super can not use together

[3]=super can not excess private members

[4]=Super can only excess the imidiate parents class

_______________________________________-----------_______________________-- */



