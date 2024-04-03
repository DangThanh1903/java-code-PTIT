import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class J07006_SoKhacNhauTrongFile3 {
     public static void main(String[] args) throws ClassNotFoundException, IOException {
        ObjectInputStream obj = new ObjectInputStream (new FileInputStream("DATA.IN"));
        List<Integer> list = (ArrayList<Integer>) obj.readObject();
        int[] counter = new int[1001];
        for (Integer i : list) {
            counter[i]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (counter[i] >= 1) {
                System.out.println(i + " " + counter[i]);
            }
        }
        obj.close();
    }  
}