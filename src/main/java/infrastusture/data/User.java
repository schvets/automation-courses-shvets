package infrastusture.data;

public class User {
    private String id;
    private String userName;
    private String password;
    private String userEmail;

    public User(String id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.userEmail = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + userEmail + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return password;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
