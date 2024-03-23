package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        int euroInput = 140;
        float euroExpected = 2;
        float euroOutput = Converter.rubleToEuro(euroInput);
        boolean euroPassed = euroExpected == euroOutput;
        System.out.println("140 rubles are 2 euro. Test result :" + euroPassed);

        int dollarInput = 120;
        float dollarExpected = 2;
        float dollarOutput = Converter.rubleToDollar(dollarInput);
        boolean dollarPassed = dollarExpected == dollarOutput;
        System.out.println("120 rubles are 2 dollars. Test result :" + dollarPassed);

        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
    }
}