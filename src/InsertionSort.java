// Insertion sort
class InsertionSort {
    public static void main(String[] args) {
        int a[] = {8, 3, 21, 5, 1, 2, 65, 9, 4, 11};
        int i, j, n, b;
        for (i = 0; i < 10; i++) {
            for (j = 0; j<i; j++){
                if (a[j]>a[i])
                {
                    b=a[i];
                    for(n=i; n>j ;n--) {
                        a[n] = a[n - 1];
                    }
                    a[j]=b;
                }
            }
        }
        for (i=0;i<10;i++) System.out.println(a[i]);
    }
}