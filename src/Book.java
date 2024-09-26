import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameBook, year);
    }

    @Override
    public String toString() {
        return "ФИО автора: %s\nНазвание книги: %s\nГод публикации: %s".formatted(author.toString(), nameBook, year);
    }
}
