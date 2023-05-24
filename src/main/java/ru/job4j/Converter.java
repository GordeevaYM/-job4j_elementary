package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl1 = value / 60;
        return rsl1;
    }

    public static float dollarToRuble(float value) {
        float rsl2 = value * 60;
        return rsl2;
    }

    public static float euroToRuble(float value) {
        float rsl3 = value * 70;
        return rsl3;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);
        float ruble = Converter.dollarToRuble(50);
        float ruble1 = Converter.euroToRuble(40);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");
        System.out.println("50 dollars are " + ruble + " rubles.");
        System.out.println("40 euro are " + ruble1 + " rubles.");
    }
}