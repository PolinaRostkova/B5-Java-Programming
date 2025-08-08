package day41_collection.exeption_account;
// runner class
public class UseAccount {
    public static void main(String[] args) {
        Account account = new Account(100);
        System.out.println(account.balance);

        try {
            account.withdraw(150);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------");

        // we have two options with compile time exception
        // 1. handle with try catch
        // 2. declare it in method signature (not handling but ignoring)
        try {
            account.login("loopcampp", "test1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("No metter what this will always run");
            System.out.println("But this optional");
        }
        System.out.println("END");
    }
}
