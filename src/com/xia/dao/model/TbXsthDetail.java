package com.xia.dao.model;

import java.io.Serializable;

public class TbXsthDetail implements Serializable {//销售退货详细
    private Integer id;// 销售退货编号
    private String tbXsthMain;// 销售退货主表
    private String spid;// 商品编号
    private Double dj;// 单价
    private Integer sl;// 数量

    public TbXsthDetail() {
    }

    public TbXsthDetail(String tbXsthMain, String spid, Double dj, Integer sl) {
        this.tbXsthMain = tbXsthMain;
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

    public String getTbXsthMain() {
        return tbXsthMain;
    }

    public void setTbXsthMain(String tbXsthMain) {
        this.tbXsthMain = tbXsthMain;
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
