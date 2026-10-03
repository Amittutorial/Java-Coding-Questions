class Animal
{
  void makesound(String s)
  {
    System.out.println("Animal make sound "+s);
  }
}
class horse extends Animal
{
    void show()
    {
        System.out.println("horse show method");
    }
}
class Cat  extends Animal
{
 void show()
 {
    System.out.println("Cat show methon");
 }                                                    //[Hierarchical inharidance]
}
class Dog extends Animal
{
    void show()
    {
        System.out.println("Dog show method");
    }
public static void main(String args[])
{
    Cat s=new Cat();
    s.show();
    s.makesound("meoww meoww");
    Dog d=new Dog();
    d.show();
    d.makesound("bark");
    horse h=new horse();
    h.show();
    h.makesound("sha Sha");
}
}