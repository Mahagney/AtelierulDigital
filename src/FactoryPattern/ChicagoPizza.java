package FactoryPattern;

public class ChicagoPizza extends Pizza {
    public ChicagoPizza(String pizzaName) {
        super(pizzaName);
    }

    @Override
    public void prepare() {
        System.out.println("prepare Chicago");
        setDaugh("sweet chicago");
        setSauce("sweet");
    }
}
