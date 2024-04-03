import java.util.Scanner;
import java.lang.Math;

public class J01018_SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            int ok = 0, sum = 0;
            String st = sc.next();
            for (int i = 0; i < st.length() - 1; i++) {
                if (!(Math.abs((int)st.charAt(i) - (int)st.charAt(i + 1)) > 1)) {
                    ok = 1;
                    break;
                }
                sum += (int)st.charAt(i) - 48;
            }
            sum += (int)st.charAt(st.length() - 1) - 48;
            if (ok == 0 && sum % 10 == 0) System.out.println("YES");
            else System.out.println("NO");
            test--;
        }
        sc.close();
    }  
}
