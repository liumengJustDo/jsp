package ssm;

public class User {
    public String username;
    public int password;
    public String Address;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {

        Address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", Address='" + Address + '\'' +
                '}';
    }
}
