package com.yang.db.router.annotation;

import java.lang.annotation.*;

/**
 * @description: 路由策略，分表标记
 * @author：杨超
 * @date: 2023/4/4
 * @Copyright：
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface DBRouterStrategy {

    boolean splitTable() default false;
}
