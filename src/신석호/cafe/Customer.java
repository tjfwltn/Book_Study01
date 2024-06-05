package 신석호.cafe;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void order(Menu menu, Cashier cashier) {
        System.out.println(name + "님이 " + menu.getName() + "를 주문합니다.");
        cashier.takeOrder(this, menu);
    }

    public void receiveOrder(Menu menu) {
        System.out.println(name + "님이 " + menu.getName() + "를 받았습니다.");
    }

    public String getName() {
        return name;
    }
}