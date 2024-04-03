import java.util.Scanner;

public class Tich2phanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int[] count = new int[999999];
        long ans1 = 1;
        long ans2 = 1;
        for (int i = 2; i <= Math.sqrt(x1);) {
            if (x1 % i == 0) {
                count[i]++;
                x1 /= i;
            }
            else i++;
        }
        count[x1]++;
        for (int i = 2; i <= Math.sqrt(y1);) {
            if (y1 % i == 0) {
                count[i]--;
                y1 /= i;
            }
            else i++;
        }
        count[y1]--;
        for (int i = 2; i <= Math.sqrt(x2);) {
            if (x2 % i == 0) {
                count[i]++;
                x2 /= i;
            }
            else i++;
        }
        count[x2]++;
        for (int i = 2; i <= Math.sqrt(y2);) {
            if (y2 % i == 0) {
                count[i]--;
                y2 /= i;
            }
            else i++;
        }
        count[y2]--;
        for (int i = 2; i < 999; i++) {
            if (count[i] > 0) {
                while (count[i] > 0) {
                    ans1 *= i;
                    count[i]--;
                }
            }
            else if (count[i] < 0) {
                while (count[i] < 0) {
                    ans2 *= i;
                    count[i]++;
                }
            }
        }
        if (ans1 == ans2) System.out.print("1");
        else {
            if (ans1 == 0) System.out.print("0");
            else {
                if (ans2 == 1) System.out.print(ans1);
                else System.out.printf("%d/%d", ans1, ans2);
            }
        }
        sc.close();
    }
}
