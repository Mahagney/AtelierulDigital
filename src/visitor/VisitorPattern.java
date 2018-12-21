package visitor;

public interface VisitorPattern {
    public void visit(Book book);
    public void visit(CD cd);
    public void visit(VideoCard videoCard);
}
