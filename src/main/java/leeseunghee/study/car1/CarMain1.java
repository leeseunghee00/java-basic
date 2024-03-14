package leeseunghee.study.car1;

public class CarMain1 {

    public static void main(String[] args) {

        final Driver driver = new Driver();
        final K3Car k3Car = new K3Car();

        // 차량 선택: K3
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경: K3 -> Model3
        final Model3Car model3Car = new Model3Car();

        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경: Model3 -> NewCar
        final NewCar newCar = new NewCar();

        driver.setCar(newCar);
        driver.drive();
    }
}
