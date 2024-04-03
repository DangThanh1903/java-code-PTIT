import java.util.Scanner;

public class ex7 {
    static int odd=0, even=0;
    static double[] arr2 = new double[1000];
    public static int creatarray()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap so phan tu trong mang : ");
        int a = sc.nextInt();
        for (int i=0;i<a;i++)
        {
            System.out.print("Nhap phan tu thu " + (i + 1) +": ");
            arr2[i] = sc.nextDouble();
        }
        sc.close();
        return a;
    }
    public static void display(int a)
    {
        for (int i=0;i<a;i++)
        {
            System.out.print(arr2[i] +" ");
        }
        System.out.print("\n");
    }
    public static void count(int a)
    {
        for (int i=0;i<a;i++)
        {
            if(arr2[i] %2 ==0)even++;
            if(arr2[i] %2 ==1)odd++;
        }
    }
    public static void main(String[] args) {
        int n = creatarray();
        display(n);
        count(n);
        System.out.print("even : " + even +" odd : " + odd );
    }
}