package cn.edu.hbpu.shop.pojo;

public class Category {
    private Integer cid;

    private String cname;

    private Integer state;
    
    private String sub;

    public String getSub() {
		return sub="false";
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}