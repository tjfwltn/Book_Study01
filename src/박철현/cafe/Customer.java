package 박철현.cafe;


public class Customer extends Employee {

    public String order(String menuName) {
        return menuName;
    }

    @Override
    public void doWorking() {
        System.out.println("업무 보기");
    }
}
