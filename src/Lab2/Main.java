package Lab2;

public class Main {
    public static void main(String [] args){
        Engine engine=new DieselEngine();
        Car car=new Car("My car", engine);
        System.out.println(car);
        car.start();

        System.out.println();

        Engine petrolEngine=new PetrolEngine();
        Car car2=new Car("My car", petrolEngine);
        System.out.println(car2);
        car2.start();
    }
}
