package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface UseCase {
    /*
     *编译器会对id进行类型检查，因此将用例文档的追踪数据库与源代码相关联是可靠的
     */
    public int id();

    public String description() default "no description";
}
