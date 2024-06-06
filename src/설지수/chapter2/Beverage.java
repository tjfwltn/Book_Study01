package 설지수.chapter2;

public class Beverage {
    private int quantity;

    // 앨리스가 마셨다는 메시지를 보내면, 직접 음료가 자신의 양을 줄이는 메서드
    public void druken(int quantity) {
        this.quantity -= quantity;
    }

    public Beverage(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
