package Lab_1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

import java.util.Scanner;

public class Main {

    public int[] createmas(){
        int[] mas = new int[0];
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите длину массива.");
            int maslen = scanner.nextInt();
            mas = new int[maslen];
            if (mas.length==0){
                System.out.println("Я не буду работать с нулевым массивом!");
            }
            else {
                System.out.println("Введите элементы массива через пробел.");
                for (int i=0;i<maslen;i++){
                    int masel = scanner.nextInt();
                    mas[i]=masel;
                }
            }
            return mas;
        }
        catch (InputMismatchException e) {
            System.out.println("Введены неверные данные!");
            mas = new int[0];
        }
        return mas;
    }

    /* #1.1 Дробная часть.
    Дана сигнатура метода: public double fraction (double x);
    Необходимо реализовать метод таким образом, чтобы он возвращал только
    дробную часть числа х. Подсказка: вещественное число может быть
    преобразовано к целому путем отбрасывания дробной части.
    Пример:
    x=5,25
    результат: 0,25 */

    public double fraction(double x) {
        if (x>0){
            double re_x = Math.floor(x);
            return x-re_x;
        }
        else {
            double re_x = Math.ceil(x);
            return x-re_x;
        }
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

    public String age (int x){
        int ost = x%10;
        if ((x%100!=11) && (ost==1)){
            return x+" год";
        }
        else if ((ost==3 && x%100!=13) || (ost==4 && x%100!=14)|| (ost==2 && x%100!=12)){
            return x+" года";
        }
        else {
            return x+" лет";
        }
    }

    /* #2.10 Вывод дней недели.
    Дана сигнатура метода: public void printDays (String x);
    В качестве параметра метод принимает строку, в которой записано название
    дня недели. Необходимо реализовать метод таким образом, чтобы он выводил
    на экран название переданного в него дня и всех последующих до конца недели
    дней. Если в качестве строки передан не день, то выводится текст “это не день
    недели”. Первый день понедельник, последний – воскресенье. Вместо if в данной
    задаче используйте switch.
    Пример 1:
    x=”четверг”
    результат:
    четверг
    пятница
    суббота
    воскресенье
    Пример 2:
    x=”чг”
    результат:
    это не день недели */

    public void printDays(String x){
        x = x.toLowerCase();
        switch (x){
            case "понедельник":
                System.out.println("Понедельник");
            case "вторник":
                System.out.println("Вторник");
            case "среда":
                System.out.println("Среда");
            case "четверг":
                System.out.println("Четверг");
            case "пятница":
                System.out.println("Пятница");
            case "суббота":
                System.out.println("Суббота");
            case "воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
                break;
        }
    }

    /* #3.2 Числа наоборот.
    Дана сигнатура метода: public String reverseListNums (int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
    которой будут записаны все числа от x до 0 (включительно).
    Пример:
    x=5
    результат: “5 4 3 2 1 0” */

    public String  reverseListNums (int x){
        StringBuilder out = new StringBuilder();
        while (x!=0){
            out.append(x).append(" ");
            x=x-1;
        }
        return out+"0";
    }

    /* #3.4 Степень числа.
    Дана сигнатура метода: public int pow (int x, int y);
    Необходимо реализовать метод таким образом, чтобы он возвращал результат
    возведения x в степень y.
    Подсказка: для получения степени необходимо умножить единицу на число x, и
    сделать это y раз, т.е. два в третьей степени это 1*2*2*2
    Пример:
    x=2
    y=5
    результат: 32 */

    public int pow (int x, int y){
        int prois = 1;
        for (int i = 1; i <= y; i++){
            prois=prois*x;
        }
        return prois;
    }

    /* #3.6 Одинаковость.
    Дана сигнатура метода: public bool equalNum (int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если
    все знаки числа одинаковы, и false в ином случае.
    Подсказки:
    int x=123%10; // х будет иметь значение 3
    int у=123/10; // у будет иметь значение 12
    Пример 1:
    x=1111
    результат: true
    Пример 2:
    x=1211
    результат: false */

    public boolean equalNum (int x){
        int last = x%10;
        int pre = x/10;
        while (pre>0){
            if (pre%10!=last) {
                return false;
            }
            pre=pre/10;
        }
        return true;
    }

    /* #3.9 Правый треугольник.
    Дана сигнатура метода: public void rightTriangle (int x);
    Необходимо реализовать метод таким образом, чтобы он выводил на экран
    треугольник из символов ‘*’ у которого х символов в высоту, а количество
    символов в ряду совпадает с номером строки, при этом треугольник выровнен
    по правому краю. Подсказка: перед символами ‘*’ следует выводить
    необходимое количество пробелов.
    Пример 1:
    x=3
    результат:
     *
     **
    ***
    Пример 2:
    x=4
    результат:
     *
     **
     ***
    **** */

    public void rightTriangle (int x){
        String ugl="";
        for (int i=1; i<=x; i++){
            ugl=ugl+"*";
            System.out.println(ugl);
        }
    }

    /* #3.10 Угадайка.
    Дана сигнатура метода: public void guessGame()
    Необходимо реализовать метод таким образом, чтобы он генерировал
    случайное число от 0 до 9, далее считывал с консоли введенное пользователем
    число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод
    запускается до тех пор, пока пользователь не угадает число. После этого
    выведите на экран количество попыток, которое потребовалось пользователю,
    чтобы угадать число.
    Пример:
    Введите число от 0 до 9:
    5
    Вы не угадали, введите число от 0 до 9:
    9
    Вы угадали!
    Вы отгадали число за 2 попытки */

    public void guessGame(){
        int gueses=1;
        Random gg = new Random();
        int num = gg.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 0 до 9: ");
        int gues = scanner.nextInt();
        while (gues!=num){
            System.out.print("\nВы не угадали, введите число от 0 до 9: ");
            gueses=gueses+1;
            gues = scanner.nextInt();
        }
        System.out.println("\nВы угадали!");
        System.out.println("На то чтобы угадать число: " + num + ", вы потратили: "+gueses+" попытки!");

    }

    /* #4.1 Поиск первого значения.
    Дана сигнатура метода: public int findFirst (int[] arr, int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал индекс
    первого вхождения числа x в массив arr. Если число не входит в массив –
    возвращается -1.
    Пример:
    arr=[1,2,3,4,2,2,5]
    x=2
    результат: 1 */

    public int findFirst (int[] arr, int x){
        for (int i = 0; i< arr.length;i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    /* #4.3 Поиск максимального.
    Дана сигнатура метода: public int maxAbs (int[] arr);
    Необходимо реализовать метод таким образом, чтобы он возвращал
    наибольшее по модулю (то есть без учета знака) значение массива arr.
    Пример:
    arr=[1,-2,-7,4,2,2,5] */

    public int maxAbs (int[] arr){
        int max=0;
        for (int j : arr) {
            if (Math.abs(j) > Math.abs(max)) {
                max = j;
            }
        }
        return max;
    }

    /* #4.6 Реверс.
    Дана сигнатура метода: public void reverse (int[] arr);
    Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
    После проведенных изменений массив должен быть записан задом-наперед.
    Пример:
    arr=[1,2,3,4,5]
    результат: arr=[5,4,3,2,1] */

    public void reverse (int[] arr){
        int mid=arr.length/2;
        int last=arr.length-1;
        for (int i =0;i<mid;i++){
            int x = arr[i];
            arr[i]=arr[last-i];
            arr[last-i]=x;
        }
        System.out.println("Ваш массив: "+ Arrays.toString(arr));
    }

    /* #4.7 Возвратный реверс.
    Дана сигнатура метода: public int[] reverseBack (int[] arr);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый
    массив, в котором значения массива arr записаны задом наперед.
    Пример:
    arr=[1,2,3,4,5]
    результат: [5,4,3,2,1] */

    public int[] reverseBack (int[] arr){
        int mid=arr.length/2;
        int last=arr.length-1;
        for (int i =0;i<mid;i++){
            int x = arr[i];
            arr[i]=arr[last-i];
            arr[last-i]=x;
        }
        return arr;
    }

    /* #4.8 Объединение.
    Дана сигнатура метода: public int[] concat (int[] arr1,int[] arr2);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый
    массив, в котором сначала идут элементы первого массива (arr1), а затем
    второго (arr2).
    Пример:
    arr1=[1,2,3]
    arr2=[7,8,9]
    результат: [1,2,3,7,8,9] */

    public int[] concat (int[] arr1,int[] arr2){
        int[] mas = new int[arr1.length+arr2.length];
        int pos = 0;
        for (int i : arr1){
            mas[pos]=i;
            pos++;
        }
        pos++;
        for (int i : arr2) {
            mas[pos] = i;
            pos++;
        }
        return mas;
    }

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
                            System.out.println("Введите число для проверки на делимость на 3 или 5.");
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
                            System.out.println("Введите возраст для проверки формы слова.");
                            int ex_2_8_input = scanner.nextInt();
                            System.out.println(isp.age(ex_2_8_input));
                            break;
                        case 10:
                            System.out.println("Введите день недели.");
                            String ex_2_10_input = scanner.next();
                            isp.printDays(ex_2_10_input);
                            break;
                        default:
                            System.out.println("Вы ввели неверный номер подзадания!");
                            break;
                    }
                    break;
                case 3:
                    switch (sub_ex) {
                        case 2:
                            System.out.println("Введите число для получения числовой последовательности.");
                            int ex_3_2_input = scanner.nextInt();
                            System.out.println(isp.reverseListNums(ex_3_2_input));
                            break;
                        case 4:
                            System.out.println("Введите два числа для получения первого числа в степени второго числа.");
                            int ex_3_4_1input = scanner.nextInt();
                            int ex_3_4_2input = scanner.nextInt();
                            System.out.println(isp.pow(ex_3_4_1input, ex_3_4_2input));
                            break;
                        case 6:
                            System.out.println("Введите число для проверки одинаковости всех элементов.");
                            int ex_3_6_input = scanner.nextInt();
                            System.out.println(isp.equalNum(ex_3_6_input));
                            break;
                        case 9:
                            System.out.println("Введите число для построения правого треугольника.");
                            int ex_3_9_input = scanner.nextInt();
                            isp.rightTriangle(ex_3_9_input);
                            break;
                        case 10:
                            isp.guessGame();
                            break;
                        default:
                            System.out.println("Вы ввели неверный номер подзадания!");
                            break;
                    }
                    break;
                case 4:
                    switch (sub_ex) {
                        case 1:
                            System.out.println("В данном задании происходит поиск первого вхождения числа в массив.");
                            int[] ex_4_1_1input = isp.createmas();
                            if (ex_4_1_1input.length==0){
                                break;
                            }
                            System.out.println("Введите число для поиска его индекса в массиве.");
                            int ex_4_1_2input = scanner.nextInt();
                            System.out.println(isp.findFirst(ex_4_1_1input, ex_4_1_2input));
                            break;
                        case 3:
                            System.out.println("В данном задании происходит поиск максимального по модулю элемента массива.");
                            int[] ex_4_3_1input = isp.createmas();
                            if (ex_4_3_1input.length==0){
                                break;
                            }
                            System.out.println(isp.maxAbs(ex_4_3_1input));
                            break;
                        case 6:
                            System.out.println("В данном задании происходит разворот массива.");
                            int[] ex_4_6_1input = isp.createmas();
                            if (ex_4_6_1input.length==0){
                                break;
                            }
                            isp.reverse(ex_4_6_1input);
                            break;
                        case 7:
                            System.out.println("В данном задании происходит разворот массива.");
                            int[] ex_4_7_1input = isp.createmas();
                            if (ex_4_7_1input.length==0){
                                break;
                            }
                            System.out.println("Ваш массив: "+ Arrays.toString(isp.reverseBack(ex_4_7_1input)));
                            break;
                        case 8:
                            System.out.println("В данном задании происходит сложение массивов.");
                            int[] ex_4_8_1input = isp.createmas();
                            int[] ex_4_8_2input = isp.createmas();
                            System.out.println("Ваш массив: "+ Arrays.toString(isp.concat(ex_4_8_1input,ex_4_8_2input)));
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