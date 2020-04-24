package com.xia.dao;

public class Columns {
    private String name;//列名
    private String type;//字段类型
    private boolean isNull;//是否可以为null
    private boolean isKey;//是否为主键
    private boolean islncrement;//是否自增

    public Columns() {
    }

    public Columns(String name, String type, boolean isNull, boolean isKey, boolean islncrement) {
        super();
        this.name = name;
        this.type = type;
        this.isNull = isNull;
        this.isKey = isKey;
        this.islncrement = islncrement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isNull() {
        return isNull;
    }

    public void setNull(boolean aNull) {
        isNull = aNull;
    }

    public boolean isKey() {
        return isKey;
    }

    public void setKey(boolean key) {
        isKey = key;
    }

    public boolean isIslncrement() {
        return islncrement;
    }

    public void setIslncrement(boolean islncrement) {
        this.islncrement = islncrement;
    }

    public void setIncrement(boolean b) {
    }

    public boolean isIncrement() {
        boolean increment = false;
        return increment;
    }
}
