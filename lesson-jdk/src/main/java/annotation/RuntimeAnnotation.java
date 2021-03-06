package  annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by sang on 2018/1/9.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface RuntimeAnnotation {

    String name() ;

    String value() ;

    String info() default "using RuntimeAnnotation";

}
