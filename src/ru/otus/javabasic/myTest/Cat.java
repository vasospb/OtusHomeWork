package ru.otus.javabasic.myTest;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I am a cat. My name is: " + super.getName());
        System.out.println("Myau");
    }

    public void cleanThemSelf(){
        System.out.println("Котик умывается");
    }
}
