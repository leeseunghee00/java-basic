package leeseunghee.study.poly.ex6;

import leeseunghee.study.poly.ex5.InterfaceAnimal;

public class SoundFlyMain {

    public static void main(String[] args) {

        final Dog dog = new Dog();
        final Bird bird = new Bird();
        final Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(final AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(final Fly animal) {
        System.out.println("동물 이동 시작");
        animal.fly();
        System.out.println("동물 이동 종료");
    }
}
