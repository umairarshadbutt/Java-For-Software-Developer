public class Accounts {
    private String number;
    private double balance;
    private String customername;
    private String customerEmail;
    private String customerPhoneNumber;

    Accounts(){
        this("55684", 500," Default name", "defalut email", "default phone number");//this is optional, it should be very first line the code
        System.out.println("This is Default constuctor");
    }

    Accounts(String number, double balance, String customername, String customerEmail, String customerPhoneNumber){
        System.out.println("This is Parameterized constuctor");
        this.number=number;
        this.balance=balance;
        this.customername=customername;
        this.customerEmail=customerEmail;
        this.customerPhoneNumber=customerPhoneNumber;

    }

    Accounts(String customername, String customerEmail, String customerPhoneNumber) {//another constructor is generated
        this("69696969", 10000, customername, customerEmail, customerPhoneNumber);
    }

    public  void deposit(double depositAmmount){
        this.balance+=depositAmmount;
        System.out.println("With " +depositAmmount +"ammount added. new balance is "+this.balance);

    }

    public void withdraw(double withdrwaAmmount){
        if (this.balance -withdrwaAmmount <=0){
            System.out.println("With" +this.balance + "You can't withdraw" +withdrwaAmmount+" ammount");
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
