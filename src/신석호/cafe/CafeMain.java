package 신석호.cafe;

public class CafeMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Cashier cashier = new Cashier();
        ProBarista proBarista  = new ProBarista();
        BeginnerBarista beginnerBarista = new BeginnerBarista();

        customer.orderMenu("아메리카노");

        String orderdMenu

        cashier.checkMenu(customer);
        barista.makeMenu();
    }
}
