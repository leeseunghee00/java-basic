package leeseunghee.study.poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {

        // 부모 변수가 자식 인스턴스 참조 = 다형적 참조
        final Parent poly = new Child();

        // 다운 캐스팅: 부모 타입 -> 자식 타입
        final Child child = (Child) poly;

        child.childMethod();
    }
}
