package org.example;
public class RomanNum {
    public static String toRoman(int number) {
        if (number < 1 || number > 3999) {
            System.out.println("Number must be between 1 and 3999");
        }

        int value[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String result = "";

        for (int i = 0; i < value.length; i++){
            while(number >= value[i]){
                result += symbol[i];
                number -= value[i];
            }
        }
        return result;
    }
}
