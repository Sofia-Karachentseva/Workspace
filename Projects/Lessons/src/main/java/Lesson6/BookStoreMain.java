package Projects.Lessons.src.main.java.Lesson6;

public class BookStoreMain {
    public static void main(String[] args) {
        BookOOP book1 = new BookOOP("Harry Potter", "J.K.Rowling", 1, 10.5, false);
        BookOOP book2 = new BookOOP("Anna Karenina", "L. Tolstoy", 2, 20, true);

        book1.setAvailable(true);
        book2.setUsdPrice(25);

        book1.printBookDetails();
        book2.printBookDetails();

    }
}
