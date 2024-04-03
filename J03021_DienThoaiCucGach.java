import java.util.Scanner;


public class J03021_DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            String str = sc.next();
            String ans = "";
            int ok = 0;
            for (int z = 0; z < str.length(); z++) {
                if ((str.charAt(z) <= 67 && str.charAt(z) >= 65) || (str.charAt(z) <= 99 && str.charAt(z) >= 97)) ans += '2';
                else if ((str.charAt(z) <= 70 && str.charAt(z) >= 68) || (str.charAt(z) <= 102 && str.charAt(z) >= 100)) ans += '3';
                else if ((str.charAt(z) <= 73 && str.charAt(z) >= 71) || (str.charAt(z) <= 105 && str.charAt(z) >= 103)) ans += '4';
                else if ((str.charAt(z) <= 76 && str.charAt(z) >= 74) || (str.charAt(z) <= 108 && str.charAt(z) >= 106)) ans += '5';
                else if ((str.charAt(z) <= 79 && str.charAt(z) >= 77) || (str.charAt(z) <= 111 && str.charAt(z) >= 109)) ans += '6';
                else if ((str.charAt(z) <= 83 && str.charAt(z) >= 80) || (str.charAt(z) <= 115 && str.charAt(z) >= 112)) ans += '7';
                else if ((str.charAt(z) <= 86 && str.charAt(z) >= 84) || (str.charAt(z) <= 118 && str.charAt(z) >= 116)) ans += '8';
                else if ((str.charAt(z) <= 90 && str.charAt(z) >= 87) || (str.charAt(z) <= 122 && str.charAt(z) >= 119)) ans += '9';
            }
            for (int z = 0, c = ans.length() - 1; z <= ans.length() / 2 && c >= ans.length() / 2; z++, c--) {
                if (ans.charAt(z) != ans.charAt(c)) {
                    ok = 1;
                    break;
                }
            }
            if (ok == 0) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}


/*
 * A - 65
 * B - 66
 * C - 67
 * D - 68
 * E - 69
 * Z - 90
 */