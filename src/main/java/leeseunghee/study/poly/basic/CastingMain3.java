package leeseunghee.study.poly.basic;

/**
 * upcasting vs downcasting
 */
public class CastingMain3 {

    public static void main(String[] args) {

        final Child child = new Child();
        final Parent parent1 = (Parent) child;  // 업캐스팅은 생략 가능 (생략 권장)
        final Parent parent2 = child;           // 업캐스팅은 생략 가능 (생략 권장)

        parent1.parentMethod();
        parent2.parentMethod();
        child.childMethod();
    }
}
