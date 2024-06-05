package 신석호.cafe;

public class CafeMain {
    public static void main(String[] args) {
        Menu americano = new Menu("아메리카노", 3000);
        Customer customerA = new Customer("A");
        Cashier cashierB = new Cashier("B");

        customerA.order(americano, cashierB);
    }
}
