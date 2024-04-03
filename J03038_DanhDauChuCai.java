import java.util.Scanner;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = 0;
        int[] counter = new int[150];
        for (int i = 0; i < str.length(); i++) {
            counter[str.charAt(i)]++;
        }
        for (int i = 97; i < 123; i++) {
            if (counter[i] > 0) ans++;
        }
        System.out.print(ans);
        sc.close();
    }
}
