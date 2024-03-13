package leeseunghee.study.poly.ex3;

public class Dog extends AbstractAnimal {

    // 추상 메서드 오버라이딩 (필수!!)
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
