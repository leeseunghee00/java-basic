package leeseunghee.study.oop1;

public class ValueObjectMain {

    public static void main(String[] args) {

        ValueData valueData = new ValueData();

        valueData.increaseValue();
        valueData.increaseValue();
        valueData.increaseValue();

        System.out.println("최종 숫자= " + valueData.value);
    }
}
