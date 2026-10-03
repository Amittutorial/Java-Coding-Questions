
class ArrayOneD {
    int sum[] = {0, 0, 0, 0,0};

    void Trevers(int a[]) {
        for (int i = 0; i < a.length; i++) {
            sum[i] = sum[i] + i;
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }

    public static void main(String args[]) {
        ArrayOneD a = new ArrayOneD();
        int arr[] = {10, 12, 13, 14,15};
        a.Trevers(arr);
    }
}