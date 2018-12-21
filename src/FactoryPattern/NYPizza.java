package FactoryPattern;

public class NYPizza extends Pizza {
    public NYPizza(String pizzaName) {
        super(pizzaName);
    }

    @Override
    public void prepare() {
        System.out.println("prepare ny");
        setDaugh("crispy");
        setSauce("spicey");
    }
}
