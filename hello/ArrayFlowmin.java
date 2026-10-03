class ArrayFlowmin
{
    public static void main(String args[])
    {
        int a[]={5,2,7,6,1,3,9,8,4};
        int key=3;
        int ws=0;
        for(int i=0;i<key;i++)
        {
            ws=ws+a[i];

        }
        int ms=ws;
        for(int i=key;i<a.length;i++)
        {
            ws=ws+a[i]-a[i-key];
        }
        ms=Math.min(ms,ws);
        System.out.println(ms);
    }
}