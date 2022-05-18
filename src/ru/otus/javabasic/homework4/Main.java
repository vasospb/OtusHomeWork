package ru.otus.javabasic.homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    List<Integer> array1 = new ArrayList<>();
    List<Integer> array2 = new ArrayList<>(array1);
    

    static int randomInt = new Random().nextInt(1000);


    public static void main(String[] args) {
        int i = 0;
        System.out.println(randomInt);
//Инициализация вопросов
        Question question1 = new Question("Сколько месяцев в году?", new String[]{"30", "12", "4", "31"},
                "12");
        Question question2 = new Question("Сколько дней в Апреле?", new String[]{"30", "31", "28"},
                "30");
        Question question3 = new Question("Какой год високосный?", new String[]{"2020", "2011", "2013", "2024"},
                "2024");

        //Старт
        Quize quize = new Quize(new Question[]{question1, question2, question3});
        quize.startQuize();
    }
}
