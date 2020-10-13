package dxy.springframework.addi.examplebeans;

/**
 * @author AD
 * @date 2020/10/13
 */
public class FakeJMSSource {
    private String userName;
    private String password;
    private String url;

    public FakeJMSSource(String userName, String password, String url) {
        this.userName = userName;
        this.password = password;
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
