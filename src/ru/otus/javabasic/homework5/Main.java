package ru.otus.javabasic.homework5;

public class Main {
    public static void main(String[] args) {
        final int size = 10000;


        MyList array = new MyList(size);

        array.mySortMethod();
        System.out.println("--------------");
        array.defaultSortMethod();

    }
}