package com.cykj.util;

import java.lang.annotation.*;

/**
 *
 */
@Retention(RetentionPolicy.RUNTIME)//用来修饰注解  runtime不仅会被保存到class文件中  jvm加载class文件之后 仍然存在
@Target(ElementType.METHOD)//用来描述注解使用的范围
@Documented //在生成javadoc的时候会把Documented注解显示出来
public @interface Log {

    //功能模块
    String module() default "";

    //操作类型
    String action() default "";

    //操作详情
    String remark() default "";
}
