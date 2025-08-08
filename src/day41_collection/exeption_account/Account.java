package day41_collection.exeption_account;
// custom class
public class Account {

     double balance;


    public Account(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void withdraw(double amount) {
       if (amount < balance){
           balance -= amount;
       } else {
           //System.out.println("Not enough money. Balance only has $" + balance);
           //throw new RuntimeException("Not enough money. Balance only has $" + balance);
           throw new NotEnoughBalanceException("Not enough money. Balance only has $" + balance);
       }
    }

    public void login (String username, String password) throws InvalidCredentialsException{
        if (!username.equalsIgnoreCase("Loopcamp")) {
            //System.out.println("Wrong username");
           // throw new Exception("Wrong username");
            throw new InvalidCredentialsException("Invalid username");
        } else {
            System.out.println("Username is correct");
        }

        if (!password.equals("Test1234")) {
            //System.out.println("Invalid password");
            //throw new Exception("Wrong password");
            throw new InvalidCredentialsException("Invalid password");
        } else  {
            System.out.println("Password is correct");
        }
    }

}
