package ru.job4j.converter;

public class Converter {

        public static float rubleToEuro(float value) {
            return value / 70;
        }

        public static float rubleToDollar(float value) {
            return value / 60;
        }

        public static void main(String[] args) {
            float expected = 2;
            float euro = Converter.rubleToEuro(140);
            float dollar = Converter.rubleToDollar(120);
            boolean outE = expected == euro;
            boolean outD = expected == dollar;
            System.out.println("140 rubles are 2. Test result : " + outE);
            System.out.println("120 rubles are 2. Test result : " + outD);
        }
}

