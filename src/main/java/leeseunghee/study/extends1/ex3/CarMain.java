package leeseunghee.study.extends1.ex3;

public class CarMain {

    public static void main(String[] args) {

        final ElectricCar electricCar = new ElectricCar();

        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        final GasCar gasCar = new GasCar();

        gasCar.move();;
        gasCar.fillUp();
        gasCar.openDoor();

        final HydrogenCar hydrogenCar = new HydrogenCar();

        hydrogenCar.move();;
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
