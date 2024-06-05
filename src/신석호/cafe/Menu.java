package 신석호.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private int price;

    List<Menu> menus = new ArrayList<>();
//    menus.addMenu("Americano");
//    menus.addMenu("Latte");
//    menus.addMenu("Cappuccino");

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
