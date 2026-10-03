/*____________________________[Super Keyword]

the super keyword is a refrence variable refers to immediateparents class Object


#Usses of super  keybords

[1]==Exess the parents class variables

[2]= Call the parents class method

[3]= call parents class constractor

*///____________________________________________________________________________________________
 
class Parentt
{
    int n=10;
    String name1="Amit";

}
class Mother extends Parentt
{
    int num=18;
    String name="Radha";
}
class childd extends Mother
{
    int num=30;
    String name ="Verma";
    void display ()
    {
        System.out.println( n+ "| " + name1 );
         System.out.println(super.num+"| "+super.name);
        System.out.println(num +"| "+name);}
         public static void main(String args [])
         {
            childd r=new childd();
            r.display();
            
         }
        }

        
/*_______________________________________________________________________________________________

/* 
        class A1
        {
            void show()
            {
                System.out.println("hello guru");
            }
            void show(int a)
            {
               System.out.println("hello guru "+a);
            }
        }
        class childd extends A1
        {
           void show()
           {
            System.out.println("childd show call");
           }
           void Display()
           {
            super.show();
            show();
            show(100);
           }
           public static void main(String args [])
           {
            childd b=new childd();
            b.Display();

           }
        }*/