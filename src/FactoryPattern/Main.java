package FactoryPattern;

public class Main {
    public static void main(String[] args){
        AbstractFactory nyf=new NYPizzaStore();
        nyf.orderPizza("nypizza");

        AbstractFactory cp=new ChicagoPizzaStore();
        cp.orderPizza("chpizza");
    }
}
