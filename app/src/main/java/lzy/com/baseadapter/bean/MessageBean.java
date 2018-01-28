package lzy.com.baseadapter.bean;

/**
 * Created by lizhiyun on 2017/10/31.
 */

public class MessageBean {
    private String number;
    private String name;
    private String body;
    private String date;
    private String type;

    public MessageBean() {
    }

    public MessageBean(String number, String name, String body) {
        this.number = number;
        this.name = name;
        this.body = body;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
