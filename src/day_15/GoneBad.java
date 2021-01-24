package day_15;

import java.lang.annotation.*;

/**
 * @author xiaoxia
 * @create 2020/12/9 4:11 下午
 */


@Retention(RetentionPolicy.RUNTIME)

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.LOCAL_VARIABLE})
public @interface GoneBad {
     String[] value() default {"",""};
}
