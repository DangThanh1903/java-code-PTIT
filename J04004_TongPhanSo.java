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

public class J04004_TongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();
        fraction fr1 = new fraction(x1, y1);
        fraction fr2 = new fraction(x2, y2);
        fraction fr3 = new fraction(fr1.getNumerator() * fr2.getDenominator() + fr2.getNumerator() * fr1.getDenominator(), fr1.getDenominator() * fr2.getDenominator());
        System.out.println(fr3);
        sc.close();
    }
}
