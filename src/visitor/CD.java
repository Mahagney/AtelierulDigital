package visitor;

public class CD implements Visitable{
    private double price;
    private double time;

    public CD(double price, double time){
        this.price=price;
        this.time=time;
    }
    public double getPrice() {
        return price;
    }

    public double getTime() {
        return time;
    }


    @Override
    public void accept(VisitorPattern visitor) {
        visitor.visit(this);
    }
}
