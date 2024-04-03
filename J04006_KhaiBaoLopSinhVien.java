import java.util.Scanner;

class Students {
    private String name;
    private double grade;
    private String birth, id;
    public Students() {
        name = "null";
        id = "null";
        birth = "null";
        grade = 0;
    }
    public Students(String name, String id, String birth, double grade) {
        this.name = name;
        this.id = id;
        this.birth = birth;
        this.grade = grade;
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
        return String.format("B20DCCN001 %s %s %s %.2f", getName(), getId(), getBirth(), getGpa());
    }
}


public class J04006_KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String id = sc.nextLine();
        String birth = sc.nextLine();
        float grade = sc.nextFloat();
        Students st = new Students(name, id, birth, grade);
        System.out.println(st);
        sc.close();
    }
}
