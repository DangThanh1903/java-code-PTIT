import java.util.Scanner;

public class J02020 {
    public static int n, k, ok = 1, count = 0;
    public static int[] ar = new int[1000];
    public static void tohop() {
        int i = k - 1;
        while (ar[i] == n - k + i + 1 && i > 0) i--;
        if (ar[0] == n - k + 1) {
            ok = 0;
            return;
        }
        else {
            ar[i] += 1;
            for (int j = i + 1; j < k; j++) {
                ar[j] = ar[j - 1] + 1;
            }
            inkq();
        }
    }

    public static void inkq() {
        for (int i = 0; i < k; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        count++;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            ar[i] = i + 1;
        }
        inkq();
        while (ok == 1) tohop();
        System.out.printf("Tong cong co %d to hop", count);
        sc.close();
    }
}
