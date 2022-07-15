package ru.otus.javabasic.finaltask;

public class FinalTaskTest {
    public void testDigit(){

        FinalTask finalTask = new FinalTask();
        Assertions.assertEquals("один рубль", finalTask.digitString(1));
        Assertions.assertEquals("двадцать рублей", finalTask.digitString(20));
    }

}
