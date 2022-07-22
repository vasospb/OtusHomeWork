package ru.otus.javabasic.finaltask;

public class FinalTask {

    public String digitString(int digit, Currency currency) {
        String[] array1_20 = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать",
                "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};
        String[] arraysTens = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто", "сто"};

        CurrencySelect currencySelect = null;
        switch (currency) {
            case RUB:
                currencySelect = new RubSelect();
                break;
            case USD:
                currencySelect = new USDSelect();
                break;
            case CNY:
                currencySelect = new CNYSelect();
                break;
        }

        if (digit <= 20) {
            return array1_20[digit] + " " + currencySelect.getCurrency(digit);
        } else if (digit <= 100) {
            int tens = digit / 10;
            int remainder = digit % 10;
            String remainderStr = remainder == 0 ? "" : array1_20[remainder];
            String r = arraysTens[tens] + " " + remainderStr + " " + currencySelect.getCurrency(remainder);
            return r.replaceAll("\\s+", " ");
        }
        throw new IllegalArgumentException("Число слишком большое");

    }

}
