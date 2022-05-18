package ru.otus.javabasic.homework3;

import java.util.Scanner;

/**
 * Заготовка для выполнения ДЗ "Система тестирования".
 */
public class Main {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        String[] questions = {"Сколько месяцев в году?","Сколько дней в Апреле?", "Какой год високосный?"};

        String[][] answerOptions = {{"10","11","12","100"},{"28","29","31","30"},{"2022","2024","2021"}};

        int[] correctAnswers = {2,3,1};

        // Примечание - можете придумать как хранить всю информацию в одном массиве
        Scanner scanner = new Scanner(System.in);
        int answer;
        boolean answerResult;

        for(int i = 0; i < questions.length; i++) {
            System.out.println("Вопрос №"+(i+1));
            System.out.println(questions[i]);

            for (int y=0; y < answerOptions[i].length; y++){
                System.out.println((y+1) + " - " + answerOptions[i][y]);
            }
            System.out.print("Ваш ответ: ");
            while (true) {
                answer = scanner.nextInt();
                scanner.nextLine();
                if (answer <= answerOptions[i].length && answer > 0){
                    break;
                } else {
                    System.out.println("Неверный выбор. Попробуйте еще раз!");
                }
            }

            // а также увеличиваем счетчики правильных и неправильных ответов

            System.out.println("Вы ответили: " + answerOptions[i][answer-1]);
            if (answerOptions[i][answer-1].equals(answerOptions[i][correctAnswers[i]])){
                System.out.println("И это правильный ответ!");
                System.out.println("---------------");
                correctCount++;
            } else {
                System.out.println("Неверно :(");
                System.out.println("---------------");
                wrongCount++;
            }
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
