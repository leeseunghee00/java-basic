package leeseunghee.study.class1;

public class ClassStudent5 {

    public static void main(String[] args) {

        final Student student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        final Student student2 = new Student();

        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        final Student[] students = { student1, student2 };

        for (Student student : students) {
            System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
        }
    }
}
