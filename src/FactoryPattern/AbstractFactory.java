package FactoryPattern;

public abstract class AbstractFactory {

    public abstract Pizza createPizza(String pizzaName);

    public Pizza orderPizza(String pizzaName){
        Pizza pizza= createPizza(pizzaName);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
