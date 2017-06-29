package cn.lanson.pojo;

import java.util.Date;

public class Picture {
    private Integer id;

    private String qiniukey;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQiniukey() {
        return qiniukey;
    }

    public void setQiniukey(String qiniukey) {
        this.qiniukey = qiniukey == null ? null : qiniukey.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}