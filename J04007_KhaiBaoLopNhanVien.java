import java.util.Scanner;

class Staff {
    private String name, sex, id;
    private String birth, address, date;
    public Staff() {
        name = "null";
        sex = "null";
        birth = "null";
        address = "null";
        id= "null";
        date = "null";
    }
    public Staff(String name, String sex, String birth, String address, String id, String date) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.id = id;
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
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
    public String getDate() {
        String[] temp = date.split("/");
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
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return String.format("00001 %s %s %s %s %s %s", getName(), getSex(), getBirth(), getAddress(), getId(), getDate());
    }
}



public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String birth = sc.nextLine();
        String address = sc.nextLine();
        String id = sc.nextLine();
        String date = sc.nextLine();
        Staff st = new Staff(name, sex, birth, address, id, date);
        System.out.println(st);
        sc.close();
    }
}
