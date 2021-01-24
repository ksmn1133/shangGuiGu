package day_12;

/**
 * @author xiaoxia
 * @create 2020/11/27 2:58 下午
 */
public class NegativenNumberException extends Exception {
    static final long SerialUID = 1111111111111L;
    public NegativenNumberException (){

    }

    public NegativenNumberException(String message) {
        super(message);
    }

    public NegativenNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativenNumberException(Throwable cause) {
        super(cause);
    }

    public NegativenNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
