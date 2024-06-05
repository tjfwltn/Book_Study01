package 신석호.cafe;

public abstract class Barista {
    private String name;

    public Barista(String name) {
        this.name = name;
    }

    public abstract void prepareCoffee(Menu menu, Cashier cashier);

    public String getName() {
        return name;
    }
}

