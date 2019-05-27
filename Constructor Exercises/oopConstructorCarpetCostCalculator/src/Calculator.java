public class Calculator {
    Floor floor= new Floor(2.5,5);
    Carpet carpet= new Carpet(8);

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCoast(){
        return (floor.getArea() * carpet.getCost());
    }
}
