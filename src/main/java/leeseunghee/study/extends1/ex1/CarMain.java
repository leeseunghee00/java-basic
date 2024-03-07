package leeseunghee.study.extends1.ex1;

public class CarMain {

    public static void main(String[] args) {

        final ElectricCar electricCar = new ElectricCar();

        electricCar.move();
        electricCar.charge();

        final GasCar gasCar = new GasCar();

        gasCar.move();;
        gasCar.fillUp();
    }
}
