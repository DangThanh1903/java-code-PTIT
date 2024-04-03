import java.util.Scanner;

public class ex16 {
    static int m,n,st;
    public static int[][] creat()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("lMoi ban nhap kich thuoc ma tran : ");
        System.out.print("So hang : "); m = sc.nextInt();
        System.out.print("So cot : "); n = sc.nextInt();
        int[][] arr= new int[m][n];
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print("Nhap value o " + i +" " + j+ ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }
    public static void display(int[][] a)
    {
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
    public static int sumbycolume(int[][] a, int c)
    { 
        int sum =0;
        for (int i=0;i<m;i++)
        {
            sum += a[i][c];
        }
        return sum;
    }
    public static int maxRow(int[][] a)
    { 
        int sum =0;
        int keep=0;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                keep += a[i][j];
            }
            if (keep > sum)
            {
                sum=keep;
                st=i;
            }
            keep=0;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] a = creat();
        display(a);
        System.out.println("Sum cua cot 2 la" + sumbycolume(a,2));
        System.out.print("Row " + st +"Max : " + maxRow(a));
    }
}