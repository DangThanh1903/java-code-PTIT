import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class J07005_SoKhacNhauTrongFile2 {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] counter = new int[1001];
        Arrays.fill(counter, 0);
        for (int i = 0; i < 100000; i++) {
            counter[dis.readInt()]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (counter[i] >= 1) {
                System.out.println(i + " " + counter[i]);
            }
        }
        dis.close();
    }  
}
