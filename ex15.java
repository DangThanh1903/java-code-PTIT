import java.util.Scanner;

public class ex15 {
    public static String creat()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi : ");
        String a = sc.nextLine();
        sc.close();
        return a;
    }
    public static void display(String a)
    {
        System.out.println(a);
    }
    public static void count(String a)
    {
        int n = a.length();
        int low=0,up=0;
        for (int i=0;i<n;i++)
        { 
            char c = a.charAt(i);
            if(Character.isLowerCase(c))low++;
            if(Character.isUpperCase(c))up++;
        }
        System.out.println("Lowercase : " + low);
        System.out.println("Uppercase : " + up);
    }
    public static void main(String[] args) {
        String a = creat();
        display(a);
        count(a);
    }
}