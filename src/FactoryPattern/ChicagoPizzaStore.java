package FactoryPattern;

public class ChicagoPizzaStore extends AbstractFactory {
    public Pizza createPizza(String pizzaName){
        Pizza pizza=new ChicagoPizza(pizzaName);
        return pizza;
    }
}
