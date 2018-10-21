package cn.edu.hbpu.shop.pojo;

import java.io.Serializable;

public class Twocategory implements Serializable{
    private Integer tcid;

    private String tcname;

    private Integer state;

    private Integer cid;

    public Integer getTcid() {
        return tcid;
    }

    public void setTcid(Integer tcid) {
        this.tcid = tcid;
    }

    public String getTcname() {
        return tcname;
    }

    public void setTcname(String tcname) {
        this.tcname = tcname == null ? null : tcname.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}