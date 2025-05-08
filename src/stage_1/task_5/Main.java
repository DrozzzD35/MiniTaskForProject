package stage_1.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        findFactorial(number);
        amountDigitsByNumber(number);


    }

    public static void findFactorial(int number) {
        for (long i = number - 1, j = number; i >= 1; i--) {
            if (i == 1) {
                System.out.println("Факториал числа " + number + " равен: " + j);
                System.out.println();
            } else {
                j *= i;
                System.out.println(j);
            }
        }
    }

    public static void amountDigitsByNumber(int numberUser) {
        int numberCycle = numberUser;
        List<Integer> digitsOfNumber = new ArrayList<>();
        int result = 0;

        while (numberCycle > 0) {
            numberCycle /= 10;
            result = numberUser % 10;
            digitsOfNumber.add(result);
            numberUser = (numberUser - result) / 10;
        }

        int amount = 0;
        for (int element : digitsOfNumber) {
            amount += element;
        }
        System.out.println("Сумма цифр равна: " + amount);

    }

}
