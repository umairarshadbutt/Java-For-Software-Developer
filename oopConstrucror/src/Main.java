public class Main {

    public static void main(String[] args) {

        Accounts umairAccount = new Accounts();
        umairAccount.withdraw(1231);

        umairAccount.deposit(1000);
        umairAccount.withdraw(500);

        umairAccount.deposit(500);
        umairAccount.withdraw(1000);
    }
}
