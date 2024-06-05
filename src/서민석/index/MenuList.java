package 서민석.index;

import java.util.HashMap;
import java.util.Map;

public class MenuList {
    private Map<String, Menu> list;

    public MenuList() {
        this.list = new HashMap<>();
    }

    @Override
    public String toString() {
        return "MenuList [list=" + list + "]";
    }
//

    public int getMenuPrice(String name) {
        Menu menu = list.get(name);
            return menu.getPrice();
    }
}
