package com.yang.db.router;

/**
 * @description: 数据源基础配置
 * @author：杨超
 * @date: 2023/4/4
 * @Copyright：
 */
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }
}
