package ru.otus.javabasic.homework6;

public class Main {
    public static void main(String[] args) {
        ApplicationLevel app = new ApplicationLevel();
        //1. вывод ошибки
        System.out.println(app.read("file.txt"));
        System.out.println("-------");
        //2. rethrow
        System.out.println(app.readDb("MyDb"));
        //3.
    }
}
