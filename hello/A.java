class  Methadoverloading1
{
    void show(int a)                                             //overidien
    {
        System.out.println(a);
    }
} class  A extends  Methadoverloading1
{
    void show(int a,String n)                             // override
    {
          System.out.println(a +" |  " +n);
    }

public static void main(String args [])
{
   A ln=new A();
   ln.show(21);
   ln.show(12,"Amit");


}
}