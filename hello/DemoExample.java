class DemoExample
{
   /* DemoExample(int a)
    {
        System.out.println(a);

    }
    DemoExample(int a,String n) 
    {
        System.out.println(a+" | "+ n);
    }
    DemoExample(int a,double b)
    {
        System.out.println(a+" | " +b);

    }
    DemoExample( )
    {
         System.out.println("it is a Default 😊 constractor");
    }
    void Show(){}
    public static void main(String args[])
    {
       
        DemoExample d1= new DemoExample( );
        DemoExample d2=new DemoExample(10,15.12);
        DemoExample d3=new DemoExample(23,"Amit");
        DemoExample d4  =new DemoExample(23);
        d1.Show();d2.Show();d3.Show();d4.Show();
    }


}
    _____________________________________________________________*/

     
    /* 
        int rollno ;
        String name;
        DemoExample(int r,String n)
        {
            rollno=r;
            name=n;

        }
        void show()
        {
          System.out.println(rollno + " | " + name);         // Write in note book
        }
        public static void main(String rgs [])
        {
            DemoExample s=new DemoExample(111,"Amit");
            s.show();
        }
    }

    ________________________________________________________________________*/

    
        int rollno ;
        String name;
        DemoExample(int rollno,String name)
        {
        /*  rollno=rollno;
             name=name;            OUTPUT= 0|null
                   
            //here loccal variable name is same as instance variable name*/
           this. rollno=rollno;
             this.name=name; 

        }
        void show()
        {
          System.out.println(rollno + " | " + name);         // Write in note book
        }
        public static void main(String rgs [])
        {
            DemoExample s=new DemoExample(111,"Amit");
            s.show();
        }
    }


