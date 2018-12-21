package visitor;

public class Visitor implements VisitorPattern{
    public double getTime() {
        return totalTime;
    }

    private double totalTime=0;
    @Override
    public void visit(Book book) {
        totalTime+=book.getPages()*10;
    }

    @Override
    public void visit(CD cd) {
        totalTime+=cd.getTime();

    }

    @Override
    public void visit(VideoCard videoCard) {
        totalTime+=videoCard.getTime();

    }
}
