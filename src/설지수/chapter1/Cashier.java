package 설지수.chapter1;

public interface Cashier {
    // 인터페이스로 만든 이유는 캐시어는 언제나 대체 가능하기 때문
    public Coffee makeCoffee(Barista barista,String name,CoffeeList coffeeList);
    public void deliverOrder(Customer customer,Coffee orderedCoffee);
}
