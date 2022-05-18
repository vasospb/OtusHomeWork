package ru.otus.javabasic.myTest;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak(){
        System.out.println("My name is: " + name);
        System.out.println("Nothing. Noname animal cannot speak");
    }
}
