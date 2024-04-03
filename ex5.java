import java.util.Scanner;

public class ex5 {
    static double[] arr2 = new double[1000];
    public static void creatarray(){
        Scanner sc = new Scanner(System.in);
        int a=50;
        for (int i=0;i<a;i++){
            System.out.print("Enter number " + (i + 1) +": ");
            arr2[i] = sc.nextDouble();
        }
        sc.close();
    }
    public static void display(int a)
    {
        for (int i=0;i<a;i++)
        {
            System.out.print(arr2[i] +" ");
        }
        System.out.print("\n");
    }
    public static double average(int a)
    {
        double sum=0;
        for (int i=0;i<a;i++)
        {
            sum += arr2[i];
        }
        return sum/50;
    }
    public static double find(double mid)
    {
        double num=0;
        System.out.print("The numbers greater the average is: \n");
        for (int i=0;i<50;i++)
        {
            if (arr2[i] > mid)
            {
                num++; System.out.print(arr2[i]+" ");
            }
        }
        return num;
    }
    public static void main(String[] args) {
        creatarray();
        int n=50;
        display(n);
        double mid = average(n);
        System.out.print("\nSo luong : "+ find(mid));
    }
}