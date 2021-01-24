package day_11;

/**
 * @author xiaoxia
 * @create 2020/11/25 2:12 下午
 * UsbTest类是测试Usb接口的类
 */
public class UsbTest {
    public static void main(String[] args) {
        Usb usb = new HardDisk("sumsang",200);
        show(new Usb() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });
    }
    public static void show(Usb usb){
        usb.start();
        usb.stop();
    }
}
