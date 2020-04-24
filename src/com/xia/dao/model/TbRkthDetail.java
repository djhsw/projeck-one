package com.xia.dao.model;

import java.io.Serializable;

public class TbRkthDetail implements Serializable {//进货退货详细信息
    private Integer id;// 进货退货编号
    private String tbRkthMain;// 进货退货主表
    private String spid;// 商品编号
    private Double dj;// 单价
    private Integer sl;// 数量

    public TbRkthDetail() {//空构造函数
    }

    public TbRkthDetail(String tbRkthMain, String spid, Double dj, Integer sl) {
        this.tbRkthMain = tbRkthMain;
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

    public String getTbRkthMain() {
        return tbRkthMain;
    }

    public void setTbRkthMain(String tbRkthMain) {
        this.tbRkthMain = tbRkthMain;
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
