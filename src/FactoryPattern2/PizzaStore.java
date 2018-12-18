package FactoryPattern2;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String pizzaName);

    public Pizza orderPizza(String pizzaName) {
        Pizza pizza = null;
        pizza = createPizza(pizzaName);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
