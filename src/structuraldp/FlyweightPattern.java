package structuraldp;

import java.util.Map;

public class FlyweightPattern {
    public static void main(String[] args) {
        BadBook badBook = new BadBook("The Alchemist", "Paulo Coelho", "fiction", "Penguin");
        badBook.display();

        Book book = BookFactory.getBook("The Alchemist", "Paulo Coelho", "fiction");
        book.display();
    }
}

class BadBook {
    private final String title;
    private final String author;
    private final String genre;
    private final String distributor;

    public BadBook(String title, String author, String genre, String distributor) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.distributor = distributor;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Distributor: " + distributor);
    }
}

// flyweight pattern is used to reduce the number of objects created and decrease memory footprint
class Book {

    // stores the extrinsic state of the book
    private final String title;
    private final String author;
    private final BookType bookType;

    public Book(String title, String author, BookType bookType) {
        this.title = title;
        this.author = author;
        this.bookType = bookType;
    }

    public void display() {
        bookType.display(title, author);
    }
}


// flyweight stores the intrinsic state of the book (immutable, context independent, shareable, never altered)
class BookType {
    private final String genre;
    private final String distributor;

    public BookType(String genre, String distributor) {
        this.genre = genre;
        this.distributor = distributor;
    }

    public void display(String title, String author) {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Distributor: " + distributor);
    }
}

class BookFactory {
    private static final Map<String, BookType> bookTypeMap = Map.of(
            "fiction", new BookType("fiction", "Penguin"),
            "non-fiction", new BookType("non-fiction", "Harper Collins")
    );

    public static Book getBook(String title, String author, String genre) {
        return new Book(title, author, bookTypeMap.get(genre));
    }
}