package visitor;

public class Book implements Visitable{
    private double price;
    private double pages;

    public Book(double price, double pages){
        this.price=price;
        this.pages=pages;
    }

    public double getPrice() {
        return price;
    }

    public double getPages() {
        return pages;
    }


    @Override
    public void accept(VisitorPattern visitor) {
        visitor.visit(this);
    }
}
