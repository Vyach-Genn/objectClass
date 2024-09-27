public class App {
    public static void main(String[] args) {

        System.out.println("Starting");

        Author author1 = new Author("Лев", "Толстой");
        Book book = new Book(author1, "Война и мир", 1810);
        System.out.println(book.toString());
        book.setYear(1812);
        System.out.println("Правильный год публикации: " + book.getYear());
        System.out.println();

        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book(author2, "Евгений Онегин", 1831);
        System.out.println(book2.toString());

    }
}
