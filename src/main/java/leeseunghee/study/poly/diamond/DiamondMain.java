package leeseunghee.study.poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {

        final InterfaceA a = new Child();

        // 오버라이딩된 값이 출력된다.
        a.methodA();
        a.methodCommon();

        final InterfaceB b = new Child();

        b.methodB();
        b.methodCommon();
    }
}
