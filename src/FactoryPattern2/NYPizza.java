package FactoryPattern2;

public class NYPizza extends Pizza {
    public NYPizza(String name, int size, int price) {
        super("NY"+name, size, price);
    }
}
