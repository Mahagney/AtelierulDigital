package FactoryPattern2;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String pizzaName) {
        Pizza pizza=null;

        switch(pizzaName) {
            case "Chicago1":
                pizza = new ChicagoPizza1(pizzaName, 20, 15);
                break;
            case "Chicago2":
                pizza = new ChicagoPizza2(10, 20);
                break;
        }

        return pizza;
    }
}
