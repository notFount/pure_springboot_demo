package com.zyp.db;

/**
 * 描述:
 *
 * @author zyp
 * @description 数据连接枚举
 * @create 2019-11-20 17:48
 */
public enum DataSourceEnum {

    FIRST("firstDataSource"),

    SECOND("secondDataSource");

    private String name;

    DataSourceEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefault() {
        String defaultDataSource = "";
        for (DataSourceEnum dataSourceEnum : DataSourceEnum.values()) {
            if (!"".equals(defaultDataSource)) {
                break;
            }
            defaultDataSource = dataSourceEnum.getName();
        }
        return defaultDataSource;
    }
}