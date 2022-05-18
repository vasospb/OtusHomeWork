package ru.otus.javabasic.homework4;

import java.util.Scanner;

public class Quize {
    int rightCount;
    int wrongCount;
    private final Question[] questions;

    public Quize(Question[] questions) {
        this.questions = questions;
        rightCount = 0;
        wrongCount = 0;
    }

    public String askAnswer(){
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();
    }

    public void startQuize(){
        for (Question question: questions  ) {
            question.printQuestion();
            if (question.askQuestion()){
                rightCount++;
            }else {
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + rightCount + ", неправильно " + wrongCount);

    }
}
