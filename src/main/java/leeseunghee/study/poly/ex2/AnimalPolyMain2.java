package leeseunghee.study.poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {

        final Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};

        for (final Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    // 변하지 않는 부분
    private static void soundAnimal(final Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
