package 설지수.chapter2;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Beverage(100);
        Door door = new Door(100);


        Alice alice = new Alice(130,"서재");
        // 위에 앨리스와 똑같은 키,위치이지만 이 앨리스들은 서로 다름.
        Alice alice2 = new Alice(130,"서재");

        // 앨리스가 음료를 집음
        alice.grabBeverage(beverage);

        // 키를 줄이기 위해 음료를 마심
        alice.drinkBeverage(30);
        // 문을 통과하는 메서드
        alice.passDoor(door);


        System.out.println("alice.getHeight() = " + alice.getHeight());
        System.out.println("beverage.getQuantity() = " + beverage.getQuantity());

        // 위에 두 앨리스가 다른지 확인
        System.out.println("alice = " + alice);
        System.out.println("alice2 = " + alice2);
    }
}
