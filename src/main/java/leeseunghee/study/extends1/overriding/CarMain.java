package leeseunghee.study.extends1.overriding;

public class CarMain {

    public static void main(String[] args) {

        final ElectricCar electricCar = new ElectricCar();

        electricCar.move();

        final GasCar gasCar = new GasCar();

        gasCar.move();;
    }
}
