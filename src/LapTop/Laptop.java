package LapTop;

import java.security.Key;

public class Laptop {

    public void powerOn() {
        System.out.println("开机成功!");
    }

    public void powerOff() {
        System.out.println("关机成功!");
    }

    public void useDevice(Usb usb) {
        //非特有方法
        usb.onDevice();

        //特有方法 需向下转型后调用
        if (usb instanceof Mouse) {
            Mouse myMouse = (Mouse) usb;
            myMouse.click();
        }
        if (usb instanceof KeyBoard) {
            KeyBoard myBoard = (KeyBoard) usb;
            myBoard.type();
        }

    }


}
