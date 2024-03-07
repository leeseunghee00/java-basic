package leeseunghee.study.extends1.ex;

public class ShopMain {

    public static void main(String[] args) {

        final Book book = new Book("JAVA", 10000, "han", 12345);
        final Album album = new Album("앨범1", 15000, "seo");
        final Movie movie = new Movie("영화1", 20000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        final int sum = book.getPrice() + album.getPrice() + movie.getPrice();

        System.out.println("상품 가격의 합: " + sum);
    }
}
