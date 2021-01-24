package day_12;

/**
 * @author xiaoxia
 * @create 2020/11/27 2:38 下午
 */
public class MyException extends Exception{
    static final long serialVersionUID = -1387516993124229948L;
    public MyException(){

    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
