

import test01.Car;
import test01.Sonata;
import test01.Moning;

public class main {
    
    public static void main(String[] arg){
        Sonata sonata = new Sonata();
        Moning moning = new Moning();

        sonata.language();
        sonata.run();
        moning.language();
        moning.run();
        moning.Data();
        System.out.println("-----------");

        Car car = null;
        car = new Sonata();
        car.language();
        car = new Moning();
        car.run();
        car.language();
        // car.Data();
        // car.language();
        System.out.println("--------");
        Car_1(new Sonata());
        Car_1(new Moning());
    }
    public static void Car_1(Car car){
        car.language();
        car.run();

    }
}
