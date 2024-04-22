package solid;

public class SRP {
    public static void main(String[] args) {
        GoodBook goodBook = new GoodBook();
        goodBook.print();

        BookPersistence bookPersistence = new BookPersistence();
        bookPersistence.save(goodBook);
        bookPersistence.load(goodBook);
    }
}

class BadBook {
    private String title;
    private String author;
    private String content;

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
    }

    // Violates Single Responsibility Principle
    public void save() {
        // Save to file
    }

    public void load() {
        // Load from file
    }

    public void lend() {
        // Lend the book
    }

    public void show() {
        // Show the book
    }
}

class GoodBook {
    private String title;
    private String author;
    private String content;

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
    }
}

// create a new class to handle the persistence of the book, granting the Book class a single responsibility
class BookPersistence {
    public void save(GoodBook book) {
        // Save to file
    }

    public void load(GoodBook book) {
        // Load from file
    }
}
