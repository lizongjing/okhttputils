package cn.tuhu.activityrouter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Router {

    String[] value();

    String[] stringParams() default "";

    String[] intParams() default "";

    String[] longParams() default "";

    String[] booleanParams() default "";

    String[] floatParams() default "";

    String[] doubleParams() default "";

    String[] byteParams() default "";

    String[] charParams() default "";

    String[] objectParams() default "";

    String[] listParams() default "";

    String[] mapParams() default "";
    String[] maplistParams() default "";

    String[] transfer() default "";
}
