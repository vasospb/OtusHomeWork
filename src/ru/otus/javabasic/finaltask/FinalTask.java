package ru.otus.javabasic.finaltask;

public class FinalTask {

    public String digitString(int digit) {
        String currency;
        String[] array1_20 = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать",
                "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};
        String[] arraysTens = {"", "", "", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьюесят", "девяносто", "сто"};

        if (digit <= 20) {
            return array1_20[digit] + " " + getCurrency(digit);
        } else if (digit <= 100) {
            int tens = digit / 10;
            int remainder = digit % 10;
            String r = arraysTens[tens] + " " + array1_20[remainder] + " " + getCurrency(remainder);
            return r.replaceAll("\\s+", " ");
        }
        return "число слишком большое";

    }

    public String getCurrency(int digit) {
        if (digit == 0)
            return "рублей";
        else if (digit == 1)
            return "рубль";
        else if (digit < 5)
            return "рубля";
        return "рублей";
    }
}
