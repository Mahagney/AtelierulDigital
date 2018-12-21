package visitor;

public class VideoCard implements Visitable{
    public VideoCard(double price, double time){
        this.price=price;
        this.time=time;
    }
    public double getPrice() {
        return price;
    }

    public double getTime() {
        return time;
    }

    private double price;
    private double time;

    @Override
    public void accept(VisitorPattern visitor) {
        visitor.visit(this);
    }
}
