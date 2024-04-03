import java.util.Scanner;

public class J03005_ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < test; i++) {
            String str = sc.nextLine();
            str = str.trim();
            String str1 = str.toLowerCase();
            String str2 = str.toUpperCase();
            int n = 0;
            for (int z = 0; z < str.length(); z++) {
                if (str.charAt(z) == ' ') {
                    n = z;
                    break;
                }
            }
            for (int j = n + 1; j < str.length(); j++) {
                if (str.charAt(j - 1) == ' ') {
                    if (str.charAt(j) != ' ')
                        System.out.print(str2.charAt(j));
                }
                else {
                    if (str.charAt(j) != ' '){
                        System.out.print(str1.charAt(j));
                    }
                    else System.out.print(" ");
                }
            }
            System.out.print(", ");
            for (int z = 0; z < n; z++) {
                System.out.print(str2.charAt(z));
            }
            System.out.println();
        }
        sc.close();
    }
}
