package com.xia.dao.model;

import java.io.Serializable;

public class TbKucun implements Serializable {//库存信息
    private String id;// 商品编号
    private String spname;// 商品名称
    private String jc;// 商品简称
    private String cd;// 产地
    private String gg;// 商品规格
    private String bz;// 包装
    private String dw;// 商品计量单位
    private Double dj;// 单价
    private Integer kcsl;// 库存数量

    public TbKucun() {//空的构造函数
    }

    public TbKucun(String id) {//主键
        this.id = id;
    }

    public TbKucun(String id, String spname, String jc, String cd, String gg, String bz, String dw, Double dj, Integer kcsl) {
        this.id = id;
        this.spname = spname;
        this.jc = jc;
        this.cd = cd;
        this.gg = gg;
        this.bz = bz;
        this.dw = dw;
        this.dj = dj;
        this.kcsl = kcsl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public String getJc() {
        return jc;
    }

    public void setJc(String jc) {
        this.jc = jc;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    public Double getDj() {
        return dj;
    }

    public void setDj(Double dj) {
        this.dj = dj;
    }

    public Integer getKcsl() {
        return kcsl;
    }

    public void setKcsl(Integer kcsl) {
        this.kcsl = kcsl;
    }
}
