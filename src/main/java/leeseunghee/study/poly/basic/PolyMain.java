package leeseunghee.study.poly.basic;

public class PolyMain {

    public static void main(String[] args) {

        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");

        final Parent parent = new Parent();

        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");

        final Child child = new Child();

        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 = 다형적 참조
        System.out.println("Parent -> Child");

        final Parent poly = new Child();
//        final Child child1 = new Parent();  // error: 자식은 부모를 담을 수 없다.

        poly.parentMethod();
//        poly.childMethod();   // error: 부모는 자식의 기능을 호출할 수 없다.

    }
}