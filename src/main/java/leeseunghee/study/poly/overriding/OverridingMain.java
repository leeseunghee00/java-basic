package leeseunghee.study.poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {

        // 자식 변수가 자식 인스턴스 참조
        final Child child = new Child();

        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);

        child.method();

        // 부모 변수가 부모 인스턴스 참조
        final Parent parent = new Parent();

        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);

        parent.method();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        final Parent poly = new Child();

        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value);    // parent ... 변수는 오버라이딩 X

        poly.method();
    }
}
