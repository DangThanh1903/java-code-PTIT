import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class J07022_LoaiBoSoNguyen {
    public static boolean isInt(String s) {
        try {
            int i = Integer.parseInt(s);
            return true;
        }

        catch (NumberFormatException er) {
            return false;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String temp = new String();
        List<String> l = new ArrayList<String>();
        while (sc.hasNextLine()) {
            temp = sc.next();
            if (!isInt(temp)) {
                l.add(temp);
            }
        }
        Collections.sort(l);
        for (String i : l) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
