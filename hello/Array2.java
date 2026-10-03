class Array2
{
    public static void main(String args[]){
        int a[]={0,4,6,8,3};
        int target=3;
        
        for(int i=0;i<a.length;i++){
            
            if(target==a[i]){
           System.out.println(i);
            }
        }
       
    }
}