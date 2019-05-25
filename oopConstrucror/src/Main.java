public class Main {

    public static void main(String[] args) {

        Accounts umairAccount = new Accounts("55684", 10000,"Muhammad Bilal", "example@404blogs.com", "+923001234567");
        umairAccount.withdraw(1231);

        umairAccount.deposit(1000);
        umairAccount.withdraw(500);

        umairAccount.deposit(500);
        umairAccount.withdraw(1000);


        Accounts aliAccount = new Accounts("Muhammad Bilal", "example@404blogs.com", "+923001234567");
        System.out.println(aliAccount.getNumber()+ "Name: " + aliAccount.getCustomername());
    }
}
