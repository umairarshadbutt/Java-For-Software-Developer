public class Accounts {
    private String number;
    private double balance;
    private String customername;
    private String customerEmail;
    private String customerPhoneNumber;

    public  void deposit(double depositAmmount){
        this.balance+=depositAmmount;
        System.out.println("With " +depositAmmount +"ammount added. new balance is "+this.balance);

    }

    public void withdraw(double withdrwaAmmount){
        if (this.balance -withdrwaAmmount <=0){
            System.out.println("Withe " +this.balance + "You can't withdraw" +withdrwaAmmount+" ammount");
        }
        else {
            this.balance -=withdrwaAmmount;
            System.out.println("With " +withdrwaAmmount +" ammount. new balance is "+this.balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }





}
