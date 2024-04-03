import java.util.Scanner;

public class J02010_SapXepDoiTroTrucTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[1000];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int temp = 0;
            for (int j = i + 1; j < n; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                } 
            }
            System.out.printf("Buoc %d:", i + 1);
            for (int z = 0; z < n; z++) {
                System.out.printf(" %d", ar[z]);
            }
            System.out.println();
        }
        sc.close();
    }
}
