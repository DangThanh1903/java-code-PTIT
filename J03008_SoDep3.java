import java.util.Scanner;

public class J03008_SoDep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int ok = 0;
            String str = sc.next();
            for (int i = 0, j = str.length() - 1; i <= str.length()/2 || j >= str.length()/2; i++, j--) {
                if (!(str.charAt(i) == str.charAt(j)) || ((str.charAt(i) == '0') || (str.charAt(i) == '1') || (str.charAt(i) == '4') || (str.charAt(i) == '6') || (str.charAt(i) == '8') || (str.charAt(i) == '9'))) {
                    ok = 1;
                    break;
                }
            }
            if (ok == 0) System.out.println("YES");
            else System.out.println("NO");
            test--;
        }
        sc.close();
    }
}
