package day_11;

/**
 * @author xiaoxia
 * @create 2020/11/25 2:13 下午
 * Usb interface contains start method and stop method
 *
 */
public interface Usb {
    /**
     * usb 接口的启动时间
     */
    int START_TIME = 1;

    /**
     * 抽象方法start，用来使其实现类实现usb接口启动
     *
     */
    void start();
    /**
     * 抽象方法stop，用来使其实现类实现usb接口关闭
     */
    void stop();



}
