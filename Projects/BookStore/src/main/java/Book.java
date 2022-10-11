

public class Book {
    // describe a book, create all the variables we need
    // name, author, id, price in USD, availability
    // using conversion rate, calculate EUR price of book
    // print all the books details including prices

    public static void main(String[] args) {
        //String bookName = "Harry Potter and the Philosopher's Stone";
        //String authorName = "J.K. Rowling";
        //int id = 1;
        //double priceInUSD = 10.5;
        //boolean isAvailable = true;

        Book book = new Book();
        book.createNewBook("Harry Potter", "J.K.Rowling", 1, 10.5, false);
        book.createNewBook("Anna Karenina", "L. Tolstoy", 2, 20, true);
    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable){
        double rate = 1.1;
        double priceInEUR = priceInUSD * rate;

        System.out.println("Book name is: " + bookName);
        //System.out.println("Author is: " + authorName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: "+ priceInUSD + " USD " + priceInEUR + " EUR ");
        System.out.println("Book is available: " + isAvailable);

    }
}
