import java.util.Scanner;

class Point {
        private double x;
        private double y;
        public Point() {
            x = 0;
            y = 0;
        }
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Point(Point p) {
            this.x = p.x;
            this.y = p.y;
        }
        double getX() {
            return x;
        }
        double getY() {
            return y;
        }
        double distance(Point p) {
            return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        }
    
        double distance(Point a, Point b) {
            return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }

public class J04008_ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point p1 = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point p2 = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point p3 = new Point(x, y);
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);
            if (a + b > c && b + c > a && c + a > b) {
                System.out.printf("%.3f\n", a + b + c);
            }
            else {

                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}
