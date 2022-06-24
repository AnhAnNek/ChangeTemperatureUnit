package com.mypackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degreeInFahrenheit = scanner.nextDouble();
        double answer = convertFahrenheitToCelsius(degreeInFahrenheit);
        System.out.println(answer);
    }

    public static double convertFahrenheitToCelsius(double degreeInFahrenheit) {
        return (5 * (degreeInFahrenheit - 32)) / 9;
    }
}
