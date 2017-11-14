package ch.hslu.plab.sw09;

import ch.hslu.plab.sw02.Temperature;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try
            {
                Temperature temperature = new Temperature( Float.valueOf(input) );
                System.out.println(temperature.getTemperatureInKelvin());
            }
            catch (NumberFormatException numberFormatException){
                System.out.println(input + " ist keine Zahl. Bitte geben Sie eine gültige Zahl ein.");
            }
        } while (!input.equals("exit"));
        System.out.println("Programm beendet.");
    }
}
