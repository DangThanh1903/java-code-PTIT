import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07003_TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()){
            String str = sc.next();
            while (str.length() != 1) {
                String str1 = "";
                String str2 = "";
                int temp = 0;
                for (int i = 0; i < str.length() / 2; i++) {
                    str1 += str.charAt(i);
                }
                for (int i = str.length() / 2; i < str.length(); i++) {
                    str2 += str.charAt(i);
                }
                str = "";
                for (int i = str1.length() - 1, j = str2.length() - 1; i >= 0 && j >= 0; i--, j--) {
                    if (str1.charAt(i) + str2.charAt(j) - 96 + temp >= 10) {
                        str += (char)(str1.charAt(i) + str2.charAt(j) - 48 - 10 + temp);
                        temp = 1;
                    }
                    else {
                        str += (char)(str1.charAt(i) + str2.charAt(j) - 48 + temp);
                        temp = 0;
                    }
                }
                if (str2.length() > str1.length()) {
                    str += (char)(str2.charAt(0) + temp);
                    temp = 0;
                }
                if (temp == 1) str += '1';
                StringBuffer sbr = new StringBuffer(str);
                sbr.reverse();
                str = sbr.toString();
                System.out.println(str);
            }
        }
        sc.close();
    }
}
