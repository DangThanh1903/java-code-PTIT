import java.util.Scanner;

class fraction {
    private long numerator, denominator;
    public fraction (){
        numerator = 1;
        denominator = 1;
    }
    public fraction (long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public long ucln(long x, long y) {
    long temp;
    while(y!= 0) {
        temp = x % y;
        x= y;
        y= temp;
    }
    return x;
}
    
    public long getNumerator() {
        return numerator/ucln(numerator, denominator);
    }
    public long getDenominator() {
        return denominator/ucln(numerator, denominator);
    }

    @Override
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }
}

public class J04003_PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long d = sc.nextLong();
        fraction fr = new fraction(n, d);
        System.out.println(fr);
        sc.close();
    }
}
