import java.util.Scanner;

public class J03025_XauDoiXunh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int ok = 0, count = 0;
            String str = sc.next();
            for (int i = 0, j = str.length() - 1; i < str.length()/2 || j > str.length()/2; i++, j--) {
                if (!(str.charAt(i) == str.charAt(j))) {
                    count++;
                }
                if (count == 2) {
                    ok = 1;
                    break;
                }
            }
            if (ok == 0) {
                if (count == 0 && str.length() % 2 == 1) System.out.println("YES");
                else if (count == 0 && str.length() % 2 != 1) System.out.println("NO");
                else if (count == 1) System.out.println("YES");
            }
            else System.out.println("NO");
            test--;
        }
        sc.close();
    }
}
