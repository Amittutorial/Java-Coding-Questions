class ArrayMiss

{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int start = 1;
        int end = a.length - 1;
        int missn = 0;

        for (int i = start; i <= end; i++) {
            if (a[i] != a[i - start]) {
                missn++;
            }
        }

        int n = a.length + 1;
        int totalsum = n * (n + 1) / 2;
        int arraysum = 0;

        for (int value : a) {
            arraysum += value;
        }

        int missingnumber = totalsum - arraysum;
        System.out.println("Missing Number: " + missingnumber);
    }
}