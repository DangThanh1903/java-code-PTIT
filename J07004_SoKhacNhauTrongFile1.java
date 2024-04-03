import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] counter = new int[1001];
        Arrays.fill(counter, 0);
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.next());
            counter[n]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (counter[i] >= 1) {
                System.out.println(i + " " + counter[i]);
            }
        }
    }  
}
