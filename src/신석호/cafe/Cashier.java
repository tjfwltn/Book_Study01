package 신석호.cafe;

public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void takeOrder(Customer customer, Menu menu) {
        System.out.println(name + "가 " + customer.getName() + "님의 주문을 받았습니다.");
        Barista barista = new ProBarista("Barista C"); // 예시로 ProBarista 사용
        barista.prepareCoffee(menu, this);
    }

    public void deliverOrder(Customer customer, Menu menu) {
        System.out.println(name + "가 " + customer.getName() + "님에게 " + menu.getName() + "를 전달했습니다.");
        customer.receiveOrder(menu);
    }

    public String getName() {
        return name;
    }
}

