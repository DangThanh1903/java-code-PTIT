import java.util.Scanner;

public class J03024_SoUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            String str = sc.next();
            int count1 = 0, count2 = 0, ok = 0;
            for (int z = 0; z < str.length() - 1; z++) {
                if (str.charAt(z) < 48 || str.charAt(z) > 57) {
                    ok = 1;
                    break;
                }
                else if (str.charAt(z) % 2 == 0) {
                    count1++;
                }
                else if (str.charAt(z) % 2 != 0) {
                    count2++;
                }
            }
            if (ok == 0) {
                if ((count2 > count1 && str.length() % 2 != 0) || (count2 < count1 && str.length() % 2 == 0)) System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}  
