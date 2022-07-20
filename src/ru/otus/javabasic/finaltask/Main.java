package ru.otus.javabasic.finaltask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       String digitString = scanner.nextLine();
       int digit = Integer.parseInt(digitString);

//        FinalTaskTest finalTaskTest = new FinalTaskTest();
//
//        finalTaskTest.testDigit();
        FinalTask finalTask = new FinalTask();
        System.out.println(finalTask.digitString(digit, Currency.USD));
//        System.out.println(finalTask.digitString(41));
//        System.out.println(finalTask.digitString(100));


    }

}
