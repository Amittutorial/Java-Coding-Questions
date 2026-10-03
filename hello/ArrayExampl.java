class ArrayExampl
{
 
public static void main (String args[])
    {  
        int a[ ]={11,12,13,14,15};
      int sum=0;

        for( int i:a)
        { if(i%2!=0)
        { 
           System.out.println("Odd Element is "+i) ;
           sum=sum+i;
        }
        else{
            System.out.println("Even Element is "+i);
        }
    }
     System.out.println("total Sum of Array "+sum);   
    }
}
