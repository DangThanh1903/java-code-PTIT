import java.util.Scanner;

public class J03040_BienSoDep {
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
            String str = sc.next();
            String[] parts = str.split("-");
            str = parts[1];
            str = removeCharAt(str,3);
            int[] ok = new int[5];
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i + 1) - str.charAt(i) != 1) {
                    ok[0] = 1;
                    break;
                }
                ok[0] = 0;
            }
            for (int i = 0; i < str.length(); i++) {
                if (!(str.charAt(i) == '6' || str.charAt(i) == '8')) {
                    ok[2] = 1;
                    break;
                }
                ok[2] = 0;
            }
            if (str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2) && str.charAt(3) == str.charAt(4)) ok[1] = 0;
            else ok[1] = 1;
            if (ok[0] == 0 || ok[1] == 0 || ok[2] == 0) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
