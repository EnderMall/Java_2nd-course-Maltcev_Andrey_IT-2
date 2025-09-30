package Lab_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите номер задания для проверки (тип int).");
            int ex = scanner.nextInt();
            System.out.println("Введите номер подзадания для проверки (тип int).");
            int sub_ex = scanner.nextInt();

            switch (ex) {
                case 1:
                    switch (sub_ex) {
                        case 1:
                            System.out.println("Введите число для возвращения его дробной части.");
                            double ex_1_1_input = scanner.nextDouble();
                            System.out.println(fraction(ex_1_1_input));
                            break;
                        case 4:
                            System.out.println("Введите число для проверки на положительность.");
                            int ex_1_4_input = scanner.nextInt();
                            System.out.println(isPositive(ex_1_4_input));
                            break;
                        case 5:
                            System.out.println("Введите число для проверки на двухзначность.");
                            int ex_1_5_input = scanner.nextInt();
                            System.out.println(is2Digits(ex_1_5_input));
                            break;
                        case 8:
                            System.out.println("Введите два числа для проверки на общие делители.");
                            int ex_1_8_1input = scanner.nextInt();
                            int ex_1_8_2input = scanner.nextInt();
                            System.out.println(isDivisor(ex_1_8_1input, ex_1_8_2input));
                            break;
                        case 9:

                            break;
                        default:
                            System.out.println("Вы ввели неверный номер подзадания!");
                            break;
                    }
                    break;
                case 2:
                    switch (sub_ex) {
                        case 3:

                            break;
                        case 5:

                            break;
                        case 7:

                            break;
                        case 8:

                            break;
                        case 10:

                            break;
                        default:
                            System.out.println("Вы ввели неверный номер подзадания!");
                            break;
                    }
                    break;
                case 3:
                    switch (sub_ex) {
                        case 2:

                            break;
                        case 4:

                            break;
                        case 6:

                            break;
                        case 9:

                            break;
                        case 10:

                            break;
                        default:
                            System.out.println("Вы ввели неверный номер подзадания!");
                            break;
                    }
                    break;
                case 4:
                    switch (sub_ex) {
                        case 1:

                            break;
                        case 3:

                            break;
                        case 6:

                            break;
                        case 7:

                            break;
                        case 8:

                            break;
                        default:
                            System.out.println("Вы ввели неверный номер подзадания!");
                            break;
                    }
                    break;
                default:
                    System.out.println("Вы ввели неверный номер задания!");
                    break;

            }
        } catch (InputMismatchException e) {
            System.out.println("Введены неверные данные!");
        }
    }

    /* #1.1 Дробная часть.
    Дана сигнатура метода: public double fraction (double x);
    Необходимо реализовать метод таким образом, чтобы он возвращал только
    дробную часть числа х. Подсказка: вещественное число может быть
    преобразовано к целому путем отбрасывания дробной части.
    Пример:
    x=5,25
    результат: 0,25 */

    public static double fraction(double x) {
        double re_x = Math.floor(x);
        return x - re_x;
    }

    /* #1.4 Есть ли позитив.
    Дана сигнатура метода: public bool isPositive (int x);
    Необходимо реализовать метод таким образом, чтобы он принимал число x и
    возвращал true, если оно положительное.
    Пример 1:
    x=3
    результат: true
    Пример 2:
    x=-5
    результат: false */

    public static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else if (x < 0) {
            return false;
        } else {
            System.out.println("Это 0, он не положительный и не отрицательный.");
            return false;
        }
    }

    /* #1.5 Двузначное.
    Дана сигнатура метода: public bool is2Digits (int x);
    Необходимо реализовать метод таким образом, чтобы он принимал число x и
    возвращал true, если оно двузначное.
    Пример 1:
    x=32
    результат: true
    Пример 2:
    x=516
    результат: false */

    public static boolean is2Digits(int x) {
        return (x / 100 < 1) && (x / 10 >= 1);
    }

    /* #1.8 Делитель.
    Дана сигнатура метода: public bool isDivisor (int a, int b);
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если
    любое из принятых чисел делит другое нацело.
    Пример 1:
    a=3 b=6
    результат: true
    Пример 2:
    a=2 b=15
    результат: false */

    public static boolean isDivisor(int a, int b) {
        try {
            return (a % b == 0) || (b % a == 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
            return false;
        }
    }
}
