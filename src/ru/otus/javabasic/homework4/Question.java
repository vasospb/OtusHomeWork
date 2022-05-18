package ru.otus.javabasic.homework4;

import java.util.Scanner;

public class Question {
    private final String question;
    private final String[] answerVariant;
    private final String rightAnswer;

    public Question(String question, String[] answerVariant, String rightAnswer) {
        this.question = question;
        this.answerVariant = answerVariant;
        this.rightAnswer = rightAnswer;
    }



    public void printQuestion(){
        System.out.println(this.question);
        for (int i=0; i<answerVariant.length; i++){
            System.out.println((i+1) + " - " + answerVariant[i]);
        }

    }

    public boolean askQuestion(){
        Scanner scanner = new Scanner(System.in);
        int choose;

        System.out.print("Ваш ответ: ");
        while (true) {
            if (scanner.hasNextInt()) {
                choose = scanner.nextInt();
                scanner.nextLine();
                if (choose > 0 && choose<= answerVariant.length){
                    System.out.println("Вы ответили: " + answerVariant[choose-1]);
                    System.out.println("--------------------------");
                    break;
                }else {
                    System.out.print("Вы выбрали: " + choose + ". Ответ должен содержать число от 1 до " + answerVariant.length +"\nВаш ответ: ");
                }
            } else {
                System.out.print("Ответ должен содержать число от 1 до " + answerVariant.length + ". Любые другие символы недопустимы!" +"\nВаш ответ: ");
                scanner.nextLine();
            }
        }
        return answerVariant[choose - 1].equals(rightAnswer);
    }

}
