package 신석호.cafe;

import java.util.ArrayList;
import java.util.List;

// 메뉴 항목을 나타내는 클래스
public class Menu {
    private String name;
    private double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}