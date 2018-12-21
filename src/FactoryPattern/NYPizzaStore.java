package FactoryPattern;

public class NYPizzaStore extends AbstractFactory {
    public Pizza createPizza(String pizzaName){
        Pizza pizza=new NYPizza(pizzaName);
        return pizza;
    }
}
