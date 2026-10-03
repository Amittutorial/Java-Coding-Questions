// class Array
// {
//     void arraysum(int a[])
//     {
//         for( int i:a)
//         {
//             System.out.println(i);
//         }
//     }

// public static void main(String args[])
// {
//     int arr[]={1,2,3,4,5};
    
//      Array c=new Array();
//      c.arraysum(arr);
     

// }
// }

//_____________________________________________________________


// class Array
// {
//     int arraysum(int a[])
//     { int sum=0;
//         for(int i=1;i<=a.length;i++)
//         {
//             sum=sum+i;
//             System.out.println(sum);
    
//         }return sum/a.length;
//     }    

// public static void main(String args[])
// {
//     int arr[]={1,2,3,4,5};
    
//      Array c=new Array();
    //  System.out.println(c.arraysum(arr));
     

// }
// }

//______________________________________________________________
 

class Array                    // very important  Question
{
    boolean similar(int a[],int b[])
    {
        int i, count=0;
        for(i=1;i<a.length;i++)
        {
            if(a[i]!=b[i])
            {
                 count++;
            }
        } return (count==0)?true:false;

    }
    public static void main(String args[])
    {
        Array sa=new Array();
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};
        System.out.println(sa.similar(a,b));


    }
}

//________________________________________________________________

// class Array                    // very important  Question
// {
//     void similar(int a[],int b[])
//     { int i;
//         int result[]={0,0,0,0,0};
//         for(i=0;i<a.length;i++)
//         {
//             result[i]=a[i]+b[i];
            
//         System.out.println(result[i]);
             
//         }  

//     }
//     public static void main(String args[])
//     {
//         Array sa=new Array();
//         int arr[]={1,2,3,4,5};
//         int brr[]={1,2,3,4,5};
//         sa.similar(arr,brr);


//     }
// }


