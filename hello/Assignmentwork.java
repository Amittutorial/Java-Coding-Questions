
// [1]=write a program to find a target element with the help of recusive binary method

// [2]= write a program number is armstrong or not;


// [3]=write a program to cheack a number is palindrom or not;

// [4]=                 *
//                  *   *   *
//               *  *   *   *   *
//           *   *  *   *    *  *   * 

//           [5]= star right shift

//           [6]=Fibonaci series



//___________________________________________________________

// class Assignmentwork {
    
//     int binarysearch(int a[][],int target,int low,int high)
//     { 
//         if(low>high)
//         {
//             return -1;
//         }
//         int mid=(low+high)/2;
//         if(a[mid] == target)
//         {
//             return mid;}

//           if(target<a[mid])
//           {
//             return binarysearch(a,low,mid-1,target);
//           }
//         else{
//             return binarysearch(a,mid+1,high,target);

//         }
//     }
//     public static void main(String args[])
//     {
//         int arr[]={10,20,30,40,50};
//         int target=50;
//         Assignmentwork  ln=new Assignmentwork ();
//         System .out.println(ln.binarysearch(arr,target));

//     }
//     }

    


//_________________________________________________________________________________________________


// class Assignmentwork
// {
//     void armstrong(int num)                   //question 2
//     {
//         int s=0,p=num,digit;
        
//         while(num>0)
//         {
//             digit =s%10;
//             s=s+digit*digit*digit;
//             num=num/10;
//         }
//         if(p==s)
//         {
//             System.out.println("number is Armstrong");

//         }
//         else{
//             System.out.println("number is not Armstrong");
//         }


//     }
//     public static void main (String args[])
//     {
//         Assignmentwork arm=new Assignmentwork();
//         arm.armstrong(123);

//     }
// }

//_________________________________________________________________________

// public class LinearSearch {
	boolean elementpreasnt(int a[],int target)
	{
		int count =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==target)
			{
				count++;
				break;
			}
		}
		return(count==0)?false:true;}
	
		int elementatindex(int a[],int target)
		{
			int position=0;
			for( int i=0;i<a.length;i++)
			{
				if(a[i]==target) {
					position=i+1;
					break;
				}
				}
			if(position!=0)
			{
				System.out.println("element is present in array");
			}
			else {
				System.out.println("Elenment is not present in array");
				
			}return position;
		
		
	}
	public static void main(String args[]) {
		int arr[]= {10,20,30,40,50};
		int target=40;
		LinearSearch ln=new LinearSearch();
		System.out.println(ln.elementpreasnt(arr,target));
		System.out.println(ln.elementatindex(arr,target));
	}

}


//_____________________________________________________________________________________________

// class Assignmentwork{
//     public static void main(String args[])
//     {
//         int i,j;
//         for(i=1;i<=5;i++)
//         {
//             for(j=1;j<=5-i;j++)
//             {
//                 System.out.print("  ");
//             }
//             for(j=1;j<=(2*i-1);j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println( );
//         }
//     }
// }


//_______________________________________________________________________________


// class Assignmentwork
// {
//     public static void main(String args[]){
//         int i,j;
//         for(i=1;i<=5;i++)
//         {
//             for(j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println( );
//         }
//         //inner tringle
//         for(i=4;i>=1;i--)
//         {
//             for(j=1;j<=i;j++){
//                 System.out.print("* " );
//             }
//             System.out.println( );
//         }
//     }

//    }

    


//___________________________________________________________________________________________________