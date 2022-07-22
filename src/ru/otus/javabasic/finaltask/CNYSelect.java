package ru.otus.javabasic.finaltask;

public class CNYSelect implements CurrencySelect{
    @Override
    public String getCurrency(int digit) {
        if (digit == 1)
            return "юань";
        else if (digit > 0 && digit < 5)
            return "юаня";
        return "юаней";
    }
}
