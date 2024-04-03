import java.util.Scanner;

class Rectangle {
    private double width;
    private double height;
    private String color;
    public Rectangle() {
        width = 1;
        height = 1;
    }        
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double findArea() {
        return width*height;
    }
    public double findPerimeter() {
        return (width + height)*2;
    }
    @Override
    public String toString() {
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), getColor());
    }
};

public class J04002_KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        Rectangle re = new Rectangle(width, height, color);
        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
        }
        else {
            System.out.println(re);
        }
        sc.close();
    }
}
