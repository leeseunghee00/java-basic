package leeseunghee.study.poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound();

    // 자식에게 상속할 목적으로 만들어짐 → 반드시 오버라이딩 하지 않아도 된다.
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
