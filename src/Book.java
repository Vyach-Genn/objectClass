public class Book {
    private Author author;
    private String nameBook;
    private int year;

    public Book(Author author, String nameBook, int year) {
        this.author = author;
        this.nameBook = nameBook;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1805 || year > 1813) {
            throw new IllegalArgumentException("invalid year");

        }
        this.year = year;

    }

}
