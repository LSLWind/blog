package lsl.wind.blog.domain;

/**
 * @Author lsl
 * @Date 2020/10/29 17:42
 */
public class User {
    private int id;
    private String name;
    private String qq;
    private String phone;
    private String password;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public String getQq() {
        return qq;
    }
    public void setQq(String qq) {
        this.qq=qq;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }
}
