import java.util.Scanner;
import java.lang.Math;

public class J01017_SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            int ok = 0;
            String st = sc.next();
            for (int i = 0; i < st.length() - 1; i++) {
                if (!(Math.abs((int)st.charAt(i) - (int)st.charAt(i + 1)) == 1)) {
                    System.out.println("NO");
                    ok = 1;
                    break;
                }
            }
            if (ok == 0) System.out.println("YES");
            test--;
        }
        sc.close();
    }  
}
