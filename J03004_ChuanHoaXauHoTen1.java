import java.util.Scanner;

public class J03004_ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < test; i++) {
            String str = sc.nextLine();
            String str1 = str.toLowerCase();
            String str2 = str.toUpperCase();
            if (str.charAt(0) != ' ') System.out.print(str2.charAt(0));
            for (int j = 1; j < str.length(); j++) {
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
            System.out.println();
        }
        sc.close();
    }
}
