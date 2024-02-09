package leeseunghee.study.class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {

        final MovieReview notebook = new MovieReview();

        notebook.title = "노트북";
        notebook.review = "진짜 인생 영화";

        final MovieReview aboutTime = new MovieReview();

        aboutTime.title = "어바웃 타임";
        aboutTime.review = "나도 시간을 되돌려 보고 싶다.";

        System.out.println("영화 제목: " + notebook.title + " , 리뷰: " + notebook.review);
        System.out.println("영화 제목: " + aboutTime.title + " , 리뷰: " + aboutTime.review);
    }
}
