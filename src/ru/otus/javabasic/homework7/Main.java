package ru.otus.javabasic.homework7;

public class Main {
    public static void main(String[] args)  {
        ApplicationLevel app = new ApplicationLevel();
        //1. вывод ошибки
        System.out.println("Упражнение 1. вывод ошибки");
        app.read();
        System.out.println("-------");
        //2. rethrow
        System.out.println("Упражнение 2. rethrow");
        System.out.println(app.readDb("MyDb"));
        //3.
        System.out.println("Упражнение 3. try-with-resources. Приложение останавливается");
        app.readFromResource();

        System.out.println("Эту строку мы не увидим");
    }
}
