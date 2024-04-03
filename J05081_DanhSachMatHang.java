import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stock implements Comparable<Stock> {
    private String id, name, unit;
    private int buyPrice, sellPrice;
    public static int counter = 1;
    
    public Stock(String name, String unit, int buyPrice, int sellPrice) {
        this.id = "MH" + String.format("%03d", counter++);
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
    public int getInterest() {
        return sellPrice - buyPrice;
    }
    public String getName() {
        return name;
    }
    public String getUnit() {
        return unit;
    }
    public long getBuyPrice() {
        return buyPrice;
    }
    public long getSellPrice() {
        return sellPrice;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getUnit() + " " + getBuyPrice() + " " + getSellPrice() + " " + getInterest();
    }

    @Override
    public int compareTo(Stock stock) {
        return stock.getInterest() - this.getInterest();
    }
}


public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        List<Stock> list = new ArrayList<>(test);
        while(test-- > 0) {
            sc.nextLine();
            String name = sc.nextLine();
            String unit = sc.next();
            int buyPrice = sc.nextInt();
            int sellPrice = sc.nextInt();
            Stock st = new Stock(name, unit, buyPrice, sellPrice);
            list.add(st);
        }
        Collections.sort(list);
        for (Stock i : list) {
            System.out.println(i);
        }
        sc.close();
    }
}
