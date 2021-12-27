package LapTop;

public class Mouse implements Usb{
    @Override
    public void onDevice(){
        System.out.println("鼠标打开程序执行!");
        System.out.println("鼠标成功开启!");
    }
    @Override
    public void offDevice(){
        System.out.println("鼠标关闭程序执行!");
        System.out.println("鼠标成功关闭!");
    }

    public void click(){
        System.out.println("click!");
    }
}
