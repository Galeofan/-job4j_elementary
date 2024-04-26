package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
                symbol = input.charAt(i);
            } else if (input.charAt(i) != symbol && counter > 1) {
                result += symbol + String.valueOf(counter);
                symbol = input.charAt(i);
                counter = 1;
            }  else {
                result += symbol;
                symbol = input.charAt(i);
            }
        }

        if (input.charAt(input.length() - 1) == symbol && counter > 1) {
             result += input.charAt(input.length() - 1) + String.valueOf(counter);
        } else {
            result += input.charAt(input.length() - 1);
        }
        return result;
    }
}
