package day33_b_encapsulation.login;
// custom class
public class Login {
    // Instance var
    private String userName;
    private String password;

    // Constructor

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // GETTER for password
    public String getPassword(String userName){
        if (userName.equals(this.userName)){
            return password;
        } else {
            return "Invalid user name";
        }
    }

    // SETTER method for the password
    public void setPassword(String userName, String newPassword){
        if (userName.equalsIgnoreCase(this.userName)){
            password = newPassword;
        }
    }

    @Override
    public String toString() {
        return "Login {" +
                " userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                " }";
    }
}
