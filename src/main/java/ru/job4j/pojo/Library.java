package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Java Beginer", "Ivanov");
        Book book2 = new Book("Java for profi", "Sidorov");
        Book book3 = new Book("SQL Pro", "Amir Khan");
        Book book4 = new Book("Clean code", "Elon Musk");
        Book[] lib = new Book[4];
        lib[0] = book1;
        lib[1] = book2;
        lib[2] = book3;
        lib[3] = book4;
        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName());
        }
        System.out.println("----------------------------");
        Book tmp = new Book(lib[0].getName(), lib[0].getAutor());
        lib[0] = lib[3];
        lib[3] = tmp;
        for (Book book: lib) {
            System.out.println(book.getName() + ". " + book.getAutor());
        }
        System.out.println("----------------------------");
        for (Book book: lib) {
            if (("Clean code").equals(book.getName())) {
                System.out.println(book.getName() + ". Autor " + book.getAutor());
            }
        }
    }
}
