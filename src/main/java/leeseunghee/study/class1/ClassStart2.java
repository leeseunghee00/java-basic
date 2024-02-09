package leeseunghee.study.class1;

public class ClassStart2 {

    public static void main(String[] args) {

        // 같은 타입끼리 묶기: 배열
        final String[] studentNames = { "학생1", "학생2" };
        final int[] studentAges = { 15, 16 };
        final int[] studentGrades = { 90, 80 };

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }

    }
}
