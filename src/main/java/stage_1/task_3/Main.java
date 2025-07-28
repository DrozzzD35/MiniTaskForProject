package stage_1.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи температуру градусов по цельсию");
        int degreesCelsius = scanner.nextInt();
        System.out.println(degreesCelsius + "°C градусов Цельсия");

        printDegreesFahrenheit(degreesCelsius);
        printDegreesKelvin(degreesCelsius);

    }

    public static void printDegreesFahrenheit(int degreesCelsius) {
        int degreesFahrenheit = (int) ((double) degreesCelsius * 1.8) + 32;
        System.out.println(degreesFahrenheit + "F градусов Фаренгейта");
    }

    public static void printDegreesKelvin(int degreesCelsius) {
        int degreesKelvin = (int) (degreesCelsius + 273.15);
        System.out.println(degreesKelvin + "K градусов Кельвина");
    }

}
