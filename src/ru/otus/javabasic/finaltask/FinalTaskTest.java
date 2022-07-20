package ru.otus.javabasic.finaltask;

import org.junit.Assert;
import org.junit.Test;

public class FinalTaskTest {

    @Test
    public void testRUBDigit() {

        FinalTask finalTask = new FinalTask();
        Assert.assertEquals("ноль рублей", finalTask.digitString(0, Currency.RUB));
        Assert.assertEquals("двадцать рублей", finalTask.digitString(20, Currency.RUB));
        Assert.assertEquals("двадцать один рубль", finalTask.digitString(21, Currency.RUB));

        try {
            finalTask.digitString(101, Currency.RUB);
            Assert.fail("Не выкинулся Exception");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Число слишком большое", e.getMessage());
        }
    }


    @Test
    public void testUSDDigit() {
        FinalTask finalTask = new FinalTask();
        Assert.assertEquals("ноль долларов", finalTask.digitString(0, Currency.USD));
        Assert.assertEquals("двадцать долларов", finalTask.digitString(20, Currency.USD));
        Assert.assertEquals("двадцать один доллар", finalTask.digitString(21, Currency.USD));

    }
}
