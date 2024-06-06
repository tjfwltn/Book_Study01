package 설지수.chapter2;

public class Alice {
    private int height;
    private String place;
    private Beverage beverage;

    public Alice(int height, String place) {
        this.height = height;
        this.place = place;
    }

    // 앨리스가 음료를 마시면 키가 줄어들고, 음료의 양이 줄어듬.
    public void drinkBeverage(int quantity){
        this.height -= quantity;
        beverage.druken(quantity);
    }
    public void passDoor(Door door){
        if (this.height > door.getHeight()){
            System.out.println("문을 통과할 수 없습니다");
        }
        else this.place = "garden";
    }

    public void grabBeverage(Beverage beverage){
        this.beverage = beverage;
    }
    public int getHeight() {
        return height;
    }

    public String getPlace() {
        return place;
    }

}
