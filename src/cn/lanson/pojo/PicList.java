package cn.lanson.pojo;

public class PicList {
    private Integer picListId;

    private String picListName;

    private String coverPic;

    private String describe;

    public Integer getPicListId() {
        return picListId;
    }

    public void setPicListId(Integer picListId) {
        this.picListId = picListId;
    }

    public String getPicListName() {
        return picListName;
    }

    public void setPicListName(String picListName) {
        this.picListName = picListName == null ? null : picListName.trim();
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic == null ? null : coverPic.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}