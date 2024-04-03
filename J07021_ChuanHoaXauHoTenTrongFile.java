import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.String;

public class J07021_ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));  
        String name = new String();
        while(true) {
            name = sc.nextLine();
            if (name.compareTo("END") == 0) break;
            String after = name.trim().replaceAll(" +", " ");
            String[] elemant = after.split("\\s");
            name = "";
            for (String i : elemant) {
                i = i.toLowerCase();
                String temp = "";
                temp += i.charAt(0);
                i = i.replaceFirst(temp, temp.toUpperCase());
                name += i + " ";
            }
            System.out.println(name);
        }
        sc.close();
    }  
    
}
