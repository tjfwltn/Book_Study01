package 설지수.chapter1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeList {
    private List<Coffee> coffeeList;

    public void add(Coffee coffee) {
        coffeeList.add(coffee);
    }

    public CoffeeList() {
        this.coffeeList = new ArrayList<Coffee>();
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public Coffee getCoffee(String name){
        for(Coffee coffee : coffeeList){
            if(coffee.getName().equals(name)){
                return coffee;
            }
        }
        return null;
    }
}
