import java.util.Scanner;

public class J01024_SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            int ok = 0;
            String st = sc.next();
            for (int i = 0; i < st.length(); i++) {
                if (!(st.charAt(i) == '0' || st.charAt(i) == '1' || st.charAt(i) == '2')) {
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
