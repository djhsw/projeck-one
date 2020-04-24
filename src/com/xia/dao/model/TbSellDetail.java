package com.xia.dao.model;

import java.io.Serializable;

public class TbSellDetail implements Serializable {//销售明细
    private Integer id;// 流水号
    private String tbSellMain;// 销售主表
    private String spid;// 商品编号
    private Double dj;// 销售单价
    private Integer sl;// 销售数量

    public TbSellDetail() {
    }

    public TbSellDetail(String tbSellMain, String spid, Double dj, Integer sl) {
        this.tbSellMain = tbSellMain;
        this.spid = spid;
        this.dj = dj;
        this.sl = sl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTbSellMain() {
        return tbSellMain;
    }

    public void setTbSellMain(String tbSellMain) {
        this.tbSellMain = tbSellMain;
    }

    public String getSpid() {
        return spid;
    }

    public void setSpid(String spid) {
        this.spid = spid;
    }

    public Double getDj() {
        return dj;
    }

    public void setDj(Double dj) {
        this.dj = dj;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }
}
