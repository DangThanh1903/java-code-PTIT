import java.util.Scanner;

public class J02034_BoSungDaySo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
        }
        int s = 0;
        if (ar1[n - 1] == n) System.out.print("Excellent!");
        else {
            for (int i = 1; i <= ar1[n - 1]; i++) {
                if (ar1[s] > i) System.out.println(i);
                else s++;
            }
        }
        sc.close();
    }
}
