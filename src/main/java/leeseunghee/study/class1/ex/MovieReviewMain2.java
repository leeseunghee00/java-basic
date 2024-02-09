package leeseunghee.study.class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {

        final MovieReview[] movieReviews = new MovieReview[2];

        final MovieReview notebook = new MovieReview();

        notebook.title = "노트북";
        notebook.review = "진짜 인생 영화";
        movieReviews[0] = notebook;

        final MovieReview aboutTime = new MovieReview();

        aboutTime.title = "어바웃 타임";
        aboutTime.review = "나도 시간을 되돌려 보고 싶다.";
        movieReviews[1] = aboutTime;

        for (MovieReview review : movieReviews) {
            System.out.println("영화 제목: " + review.title + " , 리뷰: " + review.review);
        }
    }
}
