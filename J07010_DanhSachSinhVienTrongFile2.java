import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.ParseException;




class Students {
    private static int NUM_STUDENT = 1;
    private String count;
    private String name;
    private double grade;
    private String birth, id;
    public Students() {
        name = "null";
        id = "null";
        birth = "null";
        grade = 0;
    }
    public Students(String name, String id, String birth, double grade) throws ParseException {
        this.count = "B20DCCN" + String.format("%03d", NUM_STUDENT++);
        this.name = name;
        this.id = id;
        this.birth = birth;
        this.grade = grade;
    }
    public String getCount() {
        return count;
    }
    public String getName() {
        return name;
    }
    public String getBirth() {
        String[] temp = birth.split("/");
        String ans = "";
        for (String i : temp) {
            if (i.length() == 1) {
                ans += '0' + i;
            }
            else {
                ans += i;
            }
            if (i.length() == 4){
                break;
            }
            ans += "/";
        }
        return ans;
    }
    public String getId() {
        return id;
    }
    public double getGpa() {
        return grade;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", getCount(), getName(), getId(), getBirth(), getGpa());
    }
}



public class J07010_DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            String name = sc.nextLine();
            String id = sc.nextLine();
            String birth = sc.nextLine();
            float grade = Float.parseFloat(sc.nextLine());
            Students st = new Students(name, id, birth, grade);
            System.out.println(st);
        }
        sc.close();
    }
}
