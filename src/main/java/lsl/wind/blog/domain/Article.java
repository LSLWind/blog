package lsl.wind.blog.domain;

import java.sql.Timestamp;

/**
 * @Author lsl
 * @Date 2020/10/29 17:39
 */
public class Article {
    private long id;
    private int authorId;
    private String type;
    private String label;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String content;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id=id;
    }

    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId=authorId;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type=type;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label=label;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Timestamp createTime) {
        this.createTime=createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime=updateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
