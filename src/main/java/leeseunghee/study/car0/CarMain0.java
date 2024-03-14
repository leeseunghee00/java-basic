package leeseunghee.study.car0;

public class CarMain0 {

    public static void main(String[] args) {

        final Driver driver = new Driver();
        final K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();

        final Model3Car model3Car = new Model3Car();

        driver.setK3Car(null);      //k3car 참조 제거를 위함
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
