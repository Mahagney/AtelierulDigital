package FactoryPattern2;

public abstract class Pizza {
    private String name;
    private int size;
    private int price;

    public Pizza(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public void prepare(){
        System.out.println("Prepare "+name);
    }
    public void bake(){
        System.out.println("Bake "+name);
    }
    public void cut(){
        System.out.println("Cut "+name);
    }
    public void box(){
        System.out.println("Box "+name);
    }
}
