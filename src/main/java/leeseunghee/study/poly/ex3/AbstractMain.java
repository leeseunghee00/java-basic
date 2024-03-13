package leeseunghee.study.poly.ex3;

public class AbstractMain {

    public static void main(String[] args) {

        final Dog dog = new Dog();
        final Cat cat = new Cat();
        final Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(final AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
