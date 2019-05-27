public class VipPerson {
    private  String name;
    private double balamce;
    private String email;

    VipPerson(){
        this("DefaulName", 50000,"default@gmail.com");
    }
    public VipPerson(String name, double balamce, String email) {
        this.name = name;
        this.balamce = balamce;
        this.email = email;
    }

    public VipPerson(String name, double balance) {
        this(name, balance,"default@404blogs.com");
    }

    public String getName() {
        return name;
    }

    public double getBalamce() {
        return balamce;
    }

    public String getEmail() {
        return email;
    }
}
