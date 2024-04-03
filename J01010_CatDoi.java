import java.util.Scanner;

public class J01010_CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            String st = sc.next();
            int ok = 0;
            int s = 20;
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == '8' || st.charAt(i) == '9' || st.charAt(i) == '1' || st.charAt(i) == '0') ;
                else ok = 1;
            }
            String sb = st.replace("8", "0");
            String sd = sb.replace("9", "0");
            StringBuffer se = new StringBuffer(sd);
            for (int i = 0; i < sd.length(); i++) {
                if (sd.charAt(i) == '0') s = i;
                else break;
            }
            if (s != 20) se.delete(0, s + 1);
            if (ok == 1 || se.length() == 0) System.out.println("INVALID");
            else {
                System.out.println(se);
            }
            test--;
        }
        sc.close();
    }
}
