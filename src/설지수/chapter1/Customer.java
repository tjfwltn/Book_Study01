package 설지수.chapter1;

public class Customer {
    private String name;
    private int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void order(Cashier cashier,String name){
        System.out.println(name + " 주세요");
    }

    public String getName() {
        return name;
    }
}
