import java.util.Scanner;

public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        String[] list = new String[1000];
        for (int i = 0; i < test; i++) {
            String str = sc.nextLine();
            str = str.trim();
            String str1 = str.toLowerCase();
            int m = 0;
            String temp = "";
            for (int z = 0; z < str.length(); z++) {
                if (str.charAt(z) == ' ') {
                    m = z;
                }
            }
            for (int j = m + 1; j < str.length(); j++) {
                if (str.charAt(j - 1) == ' ') {
                    if (str.charAt(j) != ' ')
                        temp += str1.charAt(j);
                }
                else {
                    if (str.charAt(j) != ' '){
                        temp += str1.charAt(j);
                    }
                    else System.out.print(" ");
                }
            }
            temp += str1.charAt(0);
            for (int j = 1; j < m; j++) {
                if (str.charAt(j - 1) == ' ' && str.charAt(j) != ' ') {
                    temp += str1.charAt(j);
                }
            }
            list[i] = temp;
            int count = 1;
            for (int z = 0; z < i; z++) {
                if (list[i].compareTo(list[z]) == 0) count++;
            }
            System.out.print(list[i]);
            if (count != 1) System.out.print(count);
            System.out.print("@ptit.edu.vn");
            System.out.println();
        }
        sc.close();
    }
}
