package 박철현.cafe;

public class CafeMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Cashier newPartTimer = new NewPartTimer();
        Barista proBarista = new ProfessinalBarista();

        String requiredCoffee = customer.order("아아");
        String coffee = newPartTimer.takeOrder(proBarista,requiredCoffee);
        System.out.println(coffee);
    }
}
