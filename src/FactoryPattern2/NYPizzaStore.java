package FactoryPattern2;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String pizzaName) {
        Pizza pizza;

        if(pizzaName.equals("NYPizza")){
            pizza=new NYPizza(pizzaName,27,22);
        }else{
            pizza=null;
        }
        return pizza;
    }
}
