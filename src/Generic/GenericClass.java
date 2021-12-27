package Generic;

public class GenericClass<E> {
    private E info;

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public static <M> void method(M m) {
        System.out.println(m);
    }
}
