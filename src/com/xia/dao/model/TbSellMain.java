package com.xia.dao.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class TbSellMain implements Serializable {//销售主表
    private String sellId;// 销售编号
    private String pzs;// 销售品种数
    private String je;// 总计金额
    private String ysjl;// 验收结论
    private String khname;// 客户名称
    private String xsdate;// 销售日期
    private String czy;// 操作员
    private String jsr;// 经手人
    private String jsfs;// 结算方式
    private Set tbSellDetails = new HashSet(0);// 销售明细

    public TbSellMain() {
    }

//    public TbSellMain(String sellId, String pzs, String je, String ysjl, String khname, String xsdate, String czy, String jsr, String jsfs, Set tbSellDetails) {
//        this.sellId = sellId;
//        this.pzs = pzs;
//        this.je = je;
//        this.ysjl = ysjl;
//        this.khname = khname;
//        this.xsdate = xsdate;
//        this.czy = czy;
//        this.jsr = jsr;
//        this.jsfs = jsfs;
//        this.tbSellDetails = tbSellDetails;
//    }

    public TbSellMain(String id, String pzsStr, String jeStr, String ysjlStr, String kehuName, String rkDate, String czyStr, String jsrStr, String jsfsStr) {
        this.sellId=id;
        this.pzs=pzsStr;
        this.je = jeStr;
        this.ysjl = ysjlStr;
        this.khname = kehuName;
        this.xsdate = rkDate;
        this.czy = czyStr;
        this.jsr = jsrStr;
        this.jsfs = jsfsStr;
    }



    public String getSellId() {
        return sellId;
    }

    public void setSellId(String sellId) {
        this.sellId = sellId;
    }

    public String getPzs() {
        return pzs;
    }

    public void setPzs(String pzs) {
        this.pzs = pzs;
    }

    public String getJe() {
        return je;
    }

    public void setJe(String je) {
        this.je = je;
    }

    public String getYsjl() {
        return ysjl;
    }

    public void setYsjl(String ysjl) {
        this.ysjl = ysjl;
    }

    public String getKhname() {
        return khname;
    }

    public void setKhname(String khname) {
        this.khname = khname;
    }

    public String getXsdate() {
        return xsdate;
    }

    public void setXsdate(String xsdate) {
        this.xsdate = xsdate;
    }

    public String getCzy() {
        return czy;
    }

    public void setCzy(String czy) {
        this.czy = czy;
    }

    public String getJsr() {
        return jsr;
    }

    public void setJsr(String jsr) {
        this.jsr = jsr;
    }

    public String getJsfs() {
        return jsfs;
    }

    public void setJsfs(String jsfs) {
        this.jsfs = jsfs;
    }

    public Set getTbSellDetails() {
        return tbSellDetails;
    }

    public void setTbSellDetails(Set tbSellDetails) {
        this.tbSellDetails = tbSellDetails;
    }
}
