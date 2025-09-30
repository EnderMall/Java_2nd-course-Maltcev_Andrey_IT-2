package Lab_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /* #1.1 Дробная часть.
    Дана сигнатура метода: public double fraction (double x);
    Необходимо реализовать метод таким образом, чтобы он возвращал только
    дробную часть числа х. Подсказка: вещественное число может быть
    преобразовано к целому путем отбрасывания дробной части.
    Пример:
    x=5,25
    результат: 0,25 */

    public double fraction(double x) {
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

    public boolean isPositive(int x) {
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

    public boolean is2Digits(int x) {
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

    public boolean isDivisor(int a, int b) {
        try {
            return (a % b == 0) || (b % a == 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
            return false;
        }
    }

    /* #1.9 Равенство.
    Дана сигнатура метода: public bool isEqual(int a, int b, int c);
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если
    все три полученных методом числа равны
    Пример 1:
    a=3 b=3 с=3
    результат: true
    Пример 2:
    a=2 b=15 с=2
    результат: false */

    public boolean isEqual(int a, int b, int c){
        return (a==b && b==c);
    }

    /* #2.3 Тридцать пять.
    Дана сигнатура метода: public bool is35 (int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если
    число x делится нацело на 3 или 5. При этом, если оно делится и на 3, и на 5, то
    вернуть надо false. Подсказка: оператор % позволяет получить остаток от
    деления.
    Пример 1:
    x=5
    результат: true
    Пример 2:
    x=8
    результат: false
    Пример 3:
    x=15
    результат: false */

    public boolean is35(int x){
        return ((x%3==0 || x%5==0)&&!(x%3==0 && x%5==0));
    }

    /* 2.5 Тройной максимум.
    Дана сигнатура метода: public int max3 (int x, int y, int z);
    Необходимо реализовать метод таким образом, чтобы он возвращал
    максимальное из трех полученных методом чисел. Подсказка: идеальное
    решение включает всего две инструкции if и не содержит вложенных if.
    Пример 1:
    x=5 y=7 z=7
    результат: 7
    Пример 2:
    x=8 y=-1 z=4 */

    public int max3 (int x, int y, int z){
        int maxx = Math.max(x, y);
        return Math.max(maxx,z);
    }

    /* #2.7 Двойная сумма.
    Дана сигнатура метода: public int sum2 (int x, int y);
    Необходимо реализовать метод таким образом, чтобы он возвращал сумму
    чисел x и y. Однако, если сумма попадает в диапазон от 10 до 19, то надо вернуть
    число 20.
    Пример 1:
    x=5 y=7
    результат: 20
    Пример 2:
    x=8 y=-1
    результат: 7 */

    public int sum2 (int x, int y){
        if (10<(x+y)&& 19>(x+y)){
            return 20;
        }
        else {
            return x+y;
        }
    }

    /* #2.8 Возраст.
    Дана сигнатура метода: public String age (int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
    которой сначала будет число х, а затем одно из слов:
    год
    года
    лет
    Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.
    Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел
    12, 13, 14.
    Слово “лет”добавляется во всех остальных случаях.
    Подсказка: оператор % позволяет получить остаток от деления.
    Пример 1:
    x=5
    результат: “5 лет”
    Пример 2:
    x=31
    результат: “31 год”
    Пример 3:
    x=44
    результат: “44 года” */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main isp = new Main();

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
                            System.out.println(isp.fraction(ex_1_1_input));
                            break;
                        case 4:
                            System.out.println("Введите число для проверки на положительность.");
                            int ex_1_4_input = scanner.nextInt();
                            System.out.println(isp.isPositive(ex_1_4_input));
                            break;
                        case 5:
                            System.out.println("Введите число для проверки на двухзначность.");
                            int ex_1_5_input = scanner.nextInt();
                            System.out.println(isp.is2Digits(ex_1_5_input));
                            break;
                        case 8:
                            System.out.println("Введите два числа для проверки на общие делители.");
                            int ex_1_8_1input = scanner.nextInt();
                            int ex_1_8_2input = scanner.nextInt();
                            System.out.println(isp.isDivisor(ex_1_8_1input, ex_1_8_2input));
                            break;
                        case 9:
                            System.out.println("Введите три числа для проверки эквиваленции.");
                            int ex_1_9_1input = scanner.nextInt();
                            int ex_1_9_2input = scanner.nextInt();
                            int ex_1_9_3input = scanner.nextInt();
                            System.out.println(isp.isEqual(ex_1_9_1input,ex_1_9_2input,ex_1_9_3input));
                            break;
                        default:
                            System.out.println("Вы ввели неверный номер подзадания!");
                            break;
                    }
                    break;
                case 2:
                    switch (sub_ex) {
                        case 3:
                            System.out.println("Введите число для проверки на делимость.");
                            int ex_2_3_input = scanner.nextInt();
                            System.out.println(isp.is35(ex_2_3_input));
                            break;
                        case 5:
                            System.out.println("Введите три числа для нахождения максимума.");
                            int ex_2_5_1input = scanner.nextInt();
                            int ex_2_5_2input = scanner.nextInt();
                            int ex_2_5_3input = scanner.nextInt();
                            System.out.println(isp.max3(ex_2_5_1input,ex_2_5_2input,ex_2_5_3input));
                            break;
                        case 7:
                            System.out.println("Введите два числа для проверки их суммы.");
                            int ex_2_7_1input = scanner.nextInt();
                            int ex_2_7_2input = scanner.nextInt();
                            System.out.println(isp.sum2(ex_2_7_1input, ex_2_7_2input));
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

}
