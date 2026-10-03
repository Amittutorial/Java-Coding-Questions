//___________________________________[Array]______________________________________
// COLLECTION OS SIMILAR TYPE OF ELEMENT STORED AT CONTEGEOUS MEMORY LOCATION
// IT IA NONPRIMITIVE MEMORY
//  __0____1____2______3______4__
// |___|____|______|______|_____|

// First element stored at 0th and last element saved in 4th arry
//                  TYPES OF ARRAY
//                  1=Single dimesional array [1-D]
//                  2=multi dimesional array
//                    * 2-D array
//                   * 3-D array

// class ArrayExample
// {
//     public static void main (String args[])
//     { int i;
//         int arr[ ]={19,20,30,40,50};

//         for(i=0;i<5;i++)
//         {
//             System.out.println(arr[4]);
//         }
//     }
//}//_______________________________________________________________________________________
//                              [SYNTAX OF FOR-EACH LOOP]
// for(datatype variable name:array)
// {
//     s.o.pln(variable)
// }
//______________________________________________________________________
// class ArrayExample
// {
//     public static void main (String args[]) 
//     {
//         int arr[ ]={10,20,30,40,50};
//         for( int i:arr)
//         {
//             if(i%2==0)
//             {
//             System.out.println(i);}
//         }
//     }
// }
// }
// _______________________________________________________________________________

// class ArrayExample
// {
 
// public static void main (String args[])
//     {  
//         int a[ ]={10,20,30,40,50};
//         int b[] = {0,0,0,0,0};
//         for( int i=0;i<5;i++)
//         {
//            b[i]=a[4-i];
            

//         }
//         System.out.println("Reversed array b");
//         for( int i:b)
//         {
//             System.out.println(i);
//         }
//     }
// }
//___________________________________________________________________________________


// class ArrayExample
// {
 
// public static void main (String args[])
//     {  
//         int a[ ]={10,20,13,17,50};
//         int sum=0;

//         for( int i:a)
//         { if(i%2!=0)
//         { sum=sum+i;
            
//         }
//     }
//         System.out.println(sum);
//     }
// }


//____________________________________________________________________-

// class ArrayExample             // Average of  arrays
// {
 
// public static void main (String args[])
//     {  
//         int a[ ]={10,20,13,17,50};
//         int sum=0,i;

//         for(i=1;i<a.length;i++)
//         { 
//         { sum=sum+a[i];
            
//         }
//     }
       
//        System.out.println(sum/a.length);
// }
// }

//_____________________________________________________________________

// class ArrayExample
// {
 
// public static void main (String args[])           // print number of even odd arrays
//     {  
//         int a[ ]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//         int e=0;
//         int o=0;
//         System.out.println(a.length);

//         for( int i:a)
//         { if(i%2==0){
//            e++;
//         }
//         else{
//            o++;
//         }
//     }
//         System.out.println(e);
//         System.out.println(o);

//     }
        
//     }
 


//_____________________________________________________________________________________

