package 명함전송서버;

import java.io.Serializable;

public class NameCardInfo implements Serializable {
    private String name;
    private String phone;
    private String eMail;
    private String add;

    public NameCardInfo(String name, String phone, String eMail, String add) {
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}

