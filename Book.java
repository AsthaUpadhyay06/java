public class Book {
    String title;

    Book(String t) {
        title = t;
    }

    void display() {
        System.out.println("Book: " + title);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Made Easy");
        b.display();
    }
} 