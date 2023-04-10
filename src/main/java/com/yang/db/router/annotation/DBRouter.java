package com.yang.db.router.annotation;

import java.lang.annotation.*;

/**
 * @description: 路由注解 目的是为切面提供切点，同时获取方法中入参属性的某个字段，这个字段会作为路由字段存在
 * @author：杨超
 * @date: 2023/4/4
 * @Copyright：
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface DBRouter {
    /** 分库分表字段*/
    String key() default  "";
}
