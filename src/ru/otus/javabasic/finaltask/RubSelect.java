package ru.otus.javabasic.finaltask;

public class RubSelect implements CurrencySelect{
    @Override
    public String getCurrency(int digit) {
        if (digit == 1)
            return "рубль";
        else if (digit > 0 && digit < 5)
            return "рубля";
        return "рублей";
    }
}
