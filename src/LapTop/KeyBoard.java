package LapTop;

public class KeyBoard implements Usb{
    @Override
    public void onDevice(){
        System.out.println("键盘打开程序启动！");
        System.out.println("键盘启动成功！");
    }
    @Override
    public void offDevice(){
        System.out.println("键盘关闭程序启动！");
        System.out.println("键盘关闭成功！");
    }
    public void type(){
        System.out.println("keyboard type!");
    }
}
