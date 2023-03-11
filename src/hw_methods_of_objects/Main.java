package hw_methods_of_objects;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author turgenev = new Author("Иван", "Тургенев");
        Book warAndPeace = new Book("Война и мир", 1867, tolstoy);
        Book mumu = new Book("Муму", 1854, turgenev);

        /* Часть предыдущего ДЗ по Объектам и классам (похоже, была неточность - автор и книга определялись отдельно, а не метод книги вызывал автора)
        System.out.println("До сеттера: " + warAndPeace.getName() + ", " + warAndPeace.getYear() + ", " + tolstoy.getFirstName() + " " + tolstoy.getLastName());
        System.out.println("До сеттера: " + mumu.getName() + ", " + mumu.getYear() + ", " + turgenev.getFirstName() + " " + turgenev.getLastName());

        warAndPeace.setYear(1999);
        System.out.println("После сеттера: " + warAndPeace.getName() + ", " + warAndPeace.getYear() + ", " + tolstoy.getFirstName() + " " + tolstoy.getLastName());
        System.out.println("После сеттера: " + mumu.getName() + ", " + mumu.getYear() + ", " + turgenev.getFirstName() + " " + turgenev.getLastName());
         */

        System.out.println(warAndPeace);
        System.out.println(mumu);
    }
}