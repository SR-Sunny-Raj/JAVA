
public class User {
    // Your code here
    private String name;
    private String mobile;
    private String username;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public User() {
        super();
    }

    public User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return ("Name:" + this.name + "\nMobile:" + this.mobile + "\nUsername:" + this.username + "\nPassword:"
                + this.password);
    }
}
