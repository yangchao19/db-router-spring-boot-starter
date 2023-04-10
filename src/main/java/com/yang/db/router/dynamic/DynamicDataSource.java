package com.yang.db.router.dynamic;

import com.yang.db.router.DBContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @description: 动态数据源获取，每当切换数据源，都要从这个里面进行获取，获取路由设置到ThreadLocal的结果
 * @author：杨超
 * @date: 2023/4/4
 * @Copyright：
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return "db" + DBContextHolder.getDBKey();
    }
}
