package 신석호.cafe;

public class BeginnerBarista extends Barista {
    public BeginnerBarista(String name) {
        super(name);
    }

    @Override
    public void prepareCoffee(Menu menu, Cashier cashier) {
        System.out.println(getName() + "가 " + menu.getName() + "를 Beginner의 방식으로 준비합니다.");
        cashier.deliverOrder(new Customer("A"), menu);
    }
}
