package CoreJava.OOP_practics2;

public class Book {

    private String title;
    private String author;
    private double price;

    public class Main {
        public static void main(String[] args) {
            // Using default constructor
            Book book1 = new Book();
            System.out.println(book1.author +""+book1.title);

            // Using parameterized constructor
            Book book2 = new Book("1984", "anurag", 150.99);
            System.out.println(book2.author +""+book2.title);
        }
    }

    public Book() {
        this.title = null;
        this.author = null;
        this.price = 0.0;
    }


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }




}
