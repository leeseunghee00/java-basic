package leeseunghee.study.extends1.ex;

public class Book extends Item {

    private final String author;
    private final int isbn;

    public Book(
            final String name,
            final int price,
            final String author,
            final int isbn
    ) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자: " + author + ", isbn: " + isbn);
    }
}
