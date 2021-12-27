package shiti03_3202015010334;

public class Apple extends Fruits{

    public Apple(String name,double price) {
        super(name,price);
    }

    @Override
    public void getFruits() {
        System.out.println("水果："+this.name);
        System.out.println("价格："+this.price);
    }
}
