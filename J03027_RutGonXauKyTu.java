import java.util.Scanner;

public class J03027_RutGonXauKyTu {
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ok = 0;
        while (ok == 0) {
            int max = str.length();
            for (int i = 0; i < str.length() - 1;) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    str = removeCharAt(str, i);
                }
                else i++;
            }
            if (max == str.length()) ok = 1;
        }
        if (str.length() == 0) System.out.println("Empty String");
        else System.out.println(str);
        sc.close();
    }
}