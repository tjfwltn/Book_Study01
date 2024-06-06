package 설지수.chapter1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("설지수",20000);

        Coffee coffee = new Coffee("바닐라라떼",3000);
        Coffee coffee1 = new Coffee("아아",3000);
        Coffee coffee2 = new Coffee("뜨아",3000);

        CoffeeList coffeeList = new CoffeeList();

        coffeeList.add(coffee);
        coffeeList.add(coffee1);
        coffeeList.add(coffee2);

        Cashier cashier = new Cashier1("종업원",coffeeList);
        Barista barista = new Barista1("바리스타1", coffeeList);

        customer.order(cashier,"바닐라라떼");
        Coffee orderedCoffee = cashier.makeCoffee(barista,"바닐라라떼",coffeeList);
        cashier.deliverOrder(customer,orderedCoffee);

    }
}
