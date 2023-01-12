package com.skypro.HW13;

public class Main {
    public static void main(String[] args) {
        Author gogol = new Author("Николай", "Гоголь");
        Book nos = new Book("Нос", gogol, 1976);
        Book war = new Book("Война и мир", new Author("Лев", "Толстой"), 2005);
        System.out.println(war.getAuthor());
        System.out.println(nos);
        System.out.println(nos.equals(war));
        System.out.println();
    }
}
