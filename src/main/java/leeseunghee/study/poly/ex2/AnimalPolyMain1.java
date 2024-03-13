package leeseunghee.study.poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {

        final Dog dog = new Dog();
        final Cat cat = new Cat();
        final Caw caw = new Caw();
        final Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(final Animal animal) {

        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
