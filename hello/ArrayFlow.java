class ArrayFlow
{
    public static void main(String args[])
    {
        int a[]={2,3,5,1,9,4};
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
        // ms=Math.max(ms,ws);
        // System.out.println(ms);

        ms=Math.min(ms,ws);
        System.out.println("minimum Array is :"+ms);
    }
}
