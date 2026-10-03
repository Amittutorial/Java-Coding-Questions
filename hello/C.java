class A
{
    void Show(int  a)
    {
        System.out.println(a);

    }
    
}
class B extends A
{
    void Show()
    {
        System.out.println("Display b");
    }
    void Display(double b)
    {
         System.out.println(b);
    }
}
class C extends B
{
    void Show ()
    {
        System.out.println("Display c");
    }
    void Display(int l,String n)
    {
         System.out.println(l+" | "+n);
    }

    public static void main(String args[])
    {
       C r=new C();
       r.Show(21);
       C l=new C();
       r.Show();
       r.Display(12.12);
       C m=new C();
       m.Show();
       m.Display(12,"Amit");


    
    }
}

