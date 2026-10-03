import java.util.Scanner;
class BankDetails
{
    public static void main(String args[])
    {
        System.out.println("Enter all Customer Details");
        Scanner b=new Scanner (System.in);
        String name;
        System.out.println("Enter Name of Customer");
        name=b.nextLine();
        System.out.println("Name of Customer "+name);

        long  a;
        System.out.println("Enter Account number");
        a=b.nextLong();
        if(a<=12)
        System.out.println("Account number of Customer "+a);
        else 
            System.out.println("Enter  valid  Account number");

        long  c;
        System.out.println("Enter Mobile number");
        c=b.nextLong();
        if(c<=10)
        System.out.println("enter mobile number "+c);
          else 
            System.out.println("enter  valid mobile number ");

          long pass;
          System.out.println("Enter password od your Account");
          pass=b.nextLong();
          System.out.println("password is "+pass);

       int Amount;
       System.out.println("Enter your Amount");
       Amount=b.nextInt();
       System.out.println("Enter your Amount is "+Amount);

       if(Amount<=10000)
       {
        System.out.println("Withdrowl is Successful");
       }
       else{
        System.out.println("Withdrowal is Failed");
       }




    }
}