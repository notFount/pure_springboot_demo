package com.zyp.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 描述:
 *
 * @author zyp
 * @description 多数据源切换
 * @create 2019-11-20 17:43
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

    // 使用ThreadLocal保证线程安全
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    @Override
    protected Object determineCurrentLookupKey() {
        String dataSource = getDataSource();
        return dataSource;
    }

    /**
     * 设置数据源
     *
     * @param dataSource
     */
    public static void setDataSource(String dataSource) {
        CONTEXT_HOLDER.set(dataSource);
        System.err.println("[将当前数据源改为]：" + dataSource);
    }

    /**
     * 获取数据源
     *
     * @return
     */
    public static String getDataSource() {
        String dataSource = CONTEXT_HOLDER.get();
        // 如果没有指定数据源，使用默认数据源
        if (null == dataSource) {
            DynamicDataSource.setDataSource(DataSourceEnum.FIRST.getDefault());
        }
        return CONTEXT_HOLDER.get();
    }

    /**
     * 清除数据源
     */
    public static void clearDataSource() {
        CONTEXT_HOLDER.remove();
    }
}