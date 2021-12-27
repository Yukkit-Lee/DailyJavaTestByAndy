package LapTop;

public class Demo01 {
    public static void main(String[] args) {

        Laptop myComputer = new Laptop();
        myComputer.powerOn();

        //鼠标使用多态写法
        Usb razerMouse = new Mouse();

        //键盘使用
        KeyBoard cherryBoard = new KeyBoard();

        myComputer.useDevice(razerMouse);
        myComputer.useDevice(cherryBoard);//此处自动进行了向上转型 (int -> double 小范围自动向大范围)
        myComputer.useDevice(new Mouse());//匿名对象也可通过


        myComputer.powerOff();
    }
}
