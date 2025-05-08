package stage_1.task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        grade(score);

    }

    /**
     * Оценивание по 5-и бальной системе где:
     * A = Отлично
     * F = Плохо
     * @param score оценка
     *
     *
     */
    public static void grade(int score) {
        switch (score) {
            case 1: {
                System.out.println("A");
            }
            case 2: {
                System.out.println("B");
            }
            case 3: {
                System.out.println("C");
            }
            case 4: {
                System.out.println("D");
            }
            case 5: {
                System.out.println("F");
            }


        }
    }
}
