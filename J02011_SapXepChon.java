import java.util.Scanner;

public class J02011_SapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1000];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int m = i;
            for (int j = i + 1; j < n; j++) {
                if (a[m] > a[j]) m = j;
            }
            int temp = a[m];
            a[m] = a[i];
            a[i] = temp;
            System.out.printf("Buoc %d:", i + 1);
            for (int z = 0; z < n; z++) {
                System.out.printf(" %d", a[z]);
            }
            System.out.println();
        }
        sc.close();
    }
}
