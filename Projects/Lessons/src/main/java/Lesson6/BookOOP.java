package Projects.Lessons.src.main.java.Lesson6;

public class BookOOP {

    String bookName;
    String authorName;
    int id;
    double priceInUSD;
    boolean isAvailable;
    double rate = 1.1;
    double priceInEUR = priceInUSD * rate;
    String euro = "EUR";
    String ruble = "RUB";

    public BookOOP(String name, String authorName, int id, double price, boolean isAvailable){
        this.bookName = name;
        this.authorName = authorName;
        this.id = id;
        this.priceInUSD = price;
        this.isAvailable = isAvailable;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUsdPrice() {
        return priceInUSD;
    }

    public void setUsdPrice(double priceInUSD) {
        this.priceInEUR = priceInUSD;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



    public double convertPrice(String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(ruble)) {
            rate = 70;
        } else {
            System.out.println("Error: unknown currency, USD price will be returned");
        }
        double priceAfterConversion = priceInUSD * rate;
        return priceAfterConversion;
    }

    public void printBookDetails(){
        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: " + priceInUSD + " USD " + priceInEUR + " EUR " + convertPrice(ruble) + " RUB");
        System.out.println("Book is available: " + isAvailable);
    }
}
