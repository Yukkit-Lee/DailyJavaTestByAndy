package Polymorphism;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("eat the fish!~");
    }

    public void catchMouse(){
        System.out.println("catch the mouse!");
    }
}
