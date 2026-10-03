class BadeSahab
{
 void show()
 {
  System.out.println("Message from Dadaji");
 }
}
class Dadaji extends BadeSahab
{
    void Display(){
        System.out.println("message from papaji");       //[types 2 Example]
    }

}
class Papaji extends Dadaji
{void Fun(){                                               // note in copy
    System.out.println("Messgage from Betaji");
}

}
class Betaji  extends Papaji
{
    void output()
    {                                                       // [Multi level haridance]s
        System.out.println("hii poops");
    }
    public static void main(String args[])
    {
        Betaji r=new Betaji();
        r.show(); 
        r.Display();
        r.Fun();
        r.output();
    }
}

