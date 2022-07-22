package ru.otus.javabasic.finaltask;

public class USDSelect implements CurrencySelect{
    @Override
    public String getCurrency(int digit) {
        if (digit == 1)
            return "доллар";
        else if (digit > 0 && digit < 5)
            return "доллара";
        return "долларов";
    }
}
