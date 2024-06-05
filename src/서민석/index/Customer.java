package 서민석.index;

public class Customer {
    private String name;
    private String money;

    public void showMenu(){

    }
    public void order(String name){
        System.out.println(name+"하나주세요");
        Casher.takeOrder(this,name);
//        Barista.makeCoffee(name);
        }
    }
}