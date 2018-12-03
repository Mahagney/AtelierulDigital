package Lab2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String [] args){
        Engine engine=new DieselEngine();
        Car car=new Car("My car1", engine);
        System.out.println(car);
        car.start();

        System.out.println();

        Engine petrolEngine=new PetrolEngine();
        Car car2=new Car("My car3", petrolEngine);
        System.out.println(car2);
        car2.start();
        Car car3=new Car("My car2", petrolEngine);
        ArrayList<Car> list=new ArrayList<Car>();
        list.add(car);
        list.add(car2);
        list.add(car3);
        Collections.sort(list);
        System.out.println(list);
    }
}
