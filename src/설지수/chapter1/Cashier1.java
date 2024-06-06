package 설지수.chapter1;

public class Cashier1 implements Cashier {
    private String name;
    private CoffeeList coffeeList;


    public Cashier1(String name, CoffeeList coffeeList) {
        this.name = name;
        this.coffeeList = coffeeList;
    }

    @Override
    public Coffee makeCoffee(Barista barista,String name,CoffeeList coffeeList) {
        // 바리스타에게 커피 만들어달라 요청

        return barista.createCoffee(name,coffeeList);
    }

    @Override
    public void deliverOrder(Customer customer, Coffee orderedCoffee) {
        System.out.println(customer.getName() + " 손님, 주문하신 "+orderedCoffee.getName() + " 나왔습니다.");
    }

}
