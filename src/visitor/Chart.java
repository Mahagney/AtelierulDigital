package visitor;
import java.util.List;
import java.util.ArrayList;
public class Chart {
    private List<Visitable> items=new ArrayList<Visitable>();

    public void addItem(Visitable v){
        items.add(v);
    }

    public double getPrice(){
        Visitor visitor=new Visitor();
        for(Visitable current:items){
            current.accept(visitor);
        }
        return visitor.getTime();
    }

    public static void main(String[] args){
        Chart c=new Chart();
        Book b=new Book(3,3);
        c.addItem(b);
        Book e=new Book(4,4);
        c.addItem(e);
        CD cd=new CD(5,5);
        c.addItem(cd);
        VideoCard v=new VideoCard(6,6);
        c.addItem(v);
        System.out.println(c.getPrice());
    }
}
