public class Book {
    String title;
    String author;
    int publicationYear;
    int numberOfPages;
    String ISBN;
    String optionalLanguage;

    public Book(String title, String author, int publicationYear, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
    }

    public Book(String title, String author, int publicationYear, int numberOfPages, String ISBN, String optionalLanguage){
        this(title, author, publicationYear, numberOfPages);
        this.ISBN = ISBN;
        this.optionalLanguage = optionalLanguage;
    }

    double calculateReadingTime(double readingSpeed){
        if (readingSpeed <= 0) {
            throw new IllegalArgumentException("Reading speed must be greater than 0.");
        }
        return numberOfPages / readingSpeed / 60;
    }
}
