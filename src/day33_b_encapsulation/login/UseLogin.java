package day33_b_encapsulation.login;
// runner class
public class UseLogin {
    public static void main(String[] args) {
        Login user1 = new Login("loopcamp", "hello!@12345");
        System.out.println(user1);
        // sometimes in code we want to limit the direct access to the specific members, this is when we use encapsulation (data hiding)

        // even tho I hide me members I want to give indirect access
        // GETTERS and SETTERS

        // Give me the password for user1

        System.out.println(user1.getPassword("loop"));
        System.out.println(user1.getPassword("loopcamp"));

        // Set a new password for user1
        // user1.password = "ejifoweif"; --- we don't have direct access

        System.out.println("----------------");
        user1.setPassword("loop", "ejifoweif");
        System.out.println(user1.getPassword("loopcamp"));

        System.out.println("----------------");
        user1.setPassword("loopcamp", "ejifoweif");
        System.out.println(user1.getPassword("loopcamp"));
    }
}
