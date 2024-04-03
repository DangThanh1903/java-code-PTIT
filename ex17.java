import java.util.Scanner;

public class ex17 {
    static String[] name = new String[1000];
    static int m,n,st;
    public static int[][] creat()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("So nhan vien : "); 
        m = sc.nextInt();
        n =9;
        int[][] arr= new int[m][n];
        for (int i=0;i<m;i++)
        { 
            System.out.print("Moi nhap ten nhan vien so " + (i + 1) + " : ");
            name[i] = sc.next();
            for (int j=2;j<8;j++)
            {
                System.out.print("Nhap luong ngay thu "+ j +" : ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }
    public static void display(int[][] a)
    { 
        System.out.print("\n");
        for (int i=0;i<m;i++)
        { 
            System.out.print(name[i] +" ");
            for (int j=2;j<n;j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
    public static void result (int[][] a)
    {
        for (int j=0;j<m;j++)
        { 
            int sum=0;
            for (int i=2;i<8;i++)
            {
                sum += a[j][i];
            }
            a[j][8] = sum;
        }
    }
    public static void main(String[] args) {
        int[][] a = creat();
        result(a);
        display(a);
    }
}