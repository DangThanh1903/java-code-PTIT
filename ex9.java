import java.util.Random;

public class ex9 {
    static Random rand = new Random();
    static int[] arr= new int[200];
    static int[] count = new int[11];
    static void creat(int n)
    {
        for (int i=0;i<200;i++)
        {
            int a = rand.nextInt(10);
            arr[i] =a;
        }
        for (int i=0;i<=10;i++)
        {
            count[i] =0;
        }
    }
    static void print(int n)
    {
        for (int i=0;i<200;i++)
        {
            count[arr[i]]++;
        }
        System.out.print("\n");
        for (int i=1;i<=10;i++)
        {
            System.out.print(i + " : " + count[i] + "\n");
        }
    }
    public static void main(String[] args) {
        int n=50;
        creat(n);
        print(n);
    }
}