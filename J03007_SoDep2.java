import java.util.Scanner;

public class J03007_SoDep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int ok = 0, sum = 0;
            String str = sc.next();
            if (str.charAt(0) != '8') ok = 1;
            else {
                for (int i = 0, j = str.length() - 1; i < str.length()/2 || j > str.length()/2; i++, j--) {
                    if (!(str.charAt(i) == str.charAt(j))) {
                        ok = 1;
                        break;
                    }
                    sum += ((int)str.charAt(i) - 48) * 2;
                }
            }
            if (str.length() % 2 != 0) sum += (int)str.charAt(str.length()/2) - 48;
            if (ok == 0 && sum % 10 == 0) System.out.println("YES");
            else System.out.println("NO");
            test--;
        }
        sc.close();
    }
}
