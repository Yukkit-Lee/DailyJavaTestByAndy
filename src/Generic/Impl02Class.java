package Generic;
//实现类中也使用泛型，在创建对象时再指定泛型
//                       ↓                              ↓
public class Impl02Class<E> implements GenericInterface<E> {
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
