import java.util.Scanner;

public class J02013_SapXepNoiBot {

    public static void BubbleSort(int[] ar, int n, int m) {
        int s = n;
        int x = 1;
        while (s >= 1) {
            for (int i = 0; i < n - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
            System.out.printf("Buoc %d: ", x);
            x++;
            for (int i = 0; i < n; i++) {
                System.out.printf(ar[i] + " ");
            }
            System.out.println();
            if (ar[0] == m) return;
            s--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int min = ar[0];
        for (int i = 1; i < n; i++) {
            if (min > ar[i]) min = ar[i];
        }
        BubbleSort(ar, n, min);
        sc.close();
    }
    
}
