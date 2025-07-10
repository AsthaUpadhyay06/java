 import java.util.HashMap;

public class bookmanagement
 {
    public static void main(String[] args) {
        HashMap<String, Book> library = new HashMap<>();
        library.put("Java Programming", new Book("Java Programming", "Author1"));
        library.put("Data Structures", new Book("Data Structures", "Author2"));

        System.out.println("Book Title: " + library.get("Java Programming").getTitle());
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
} 