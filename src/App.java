public class App {
    public static void main(String[] args) {

        System.out.println("Starting");

        Author author1 = new Author("Лев", "Толстой");
        Book book = new Book(author1, "Война и мир", 1810);
        System.out.println("ФИО автора: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname());
        System.out.println("Название книги: " + book.getNameBook());
        System.out.println("Ошибочный год публикации:" + book.getYear());
        book.setYear(1812);
        System.out.println("Правильный год публикации: " + book.getYear());
        System.out.println();

        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book(author2, "Евгений Онегин", 1831);
        System.out.println("ФИО автора: " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());
        System.out.println("Название книги: " + book2.getNameBook());
        System.out.println("Год публикации: " + book2.getYear());


    }
}
