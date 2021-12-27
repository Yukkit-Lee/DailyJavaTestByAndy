package Generic;
//1.在实现类中指定泛型                                   ↓
public class ImplClass implements GenericInterface<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
