package 설지수.chapter1;

public class Barista1 implements Barista{

    private String name;
    private CoffeeList coffeeList;


    public Barista1(String name, CoffeeList coffeeList) {
        this.name = name;
        this.coffeeList = coffeeList;
    }

    @Override
    public Coffee createCoffee(String name, CoffeeList coffeeList) {

       Coffee coffee = coffeeList.getCoffee(name);
        System.out.println(coffee.getName() + " 제작 완료");
        return coffee;
    }
}
