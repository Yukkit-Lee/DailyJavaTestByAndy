package shiti03_3202015010334;

public abstract class Fruits {

    String name;
    double price;

    public Fruits(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void getFruits();
}
