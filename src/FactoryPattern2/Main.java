package FactoryPattern2;

public class Main {
    public static void main(String[] args){
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        Pizza pizza= pizzaStore.orderPizza("Chicago1");
        System.out.println(pizza.toString()+"\n");

        pizza= pizzaStore.orderPizza("Chicago2");
        System.out.println(pizza.toString()+"\n");

        PizzaStore pizzaStore2 = new NYPizzaStore();
        pizza= pizzaStore2.orderPizza("NYPizza");
        System.out.println(pizza.toString()+"\n");
    }
}
