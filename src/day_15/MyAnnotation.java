package day_15;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xiaoxia
 * @create 2020/12/9 2:24 下午
 *
 * 四种元注解(修饰注解的注解)
 * Retention:SOURCE CLASS RUNTIME
 * Target
 * Documented
 * Inherited
 *
 */
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.PACKAGE,ElementType.PARAMETER})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
    String[] value() default {"1","2"};
}
