package Lab_2.Ex5;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5code {
    public void code(){
        System.out.println("\n#4.4 Выберете один из предложенных ниже вариантов:");
        System.out.println("1 - Ввести своё время.");
        System.out.println("2 - Перевести секунды во время.");
        System.out.println("3 - Результат задания #4.4.");
        Scanner scan = new Scanner(System.in);
        try {
            int shooz=scan.nextInt();
            if (shooz==1){
                System.out.println("Введите 3 числа через пробел (Часы Минуты Секунды)!");
                GoodTime time = new GoodTime(true);
                time.hh=scan.nextInt();
                time.mm=scan.nextInt();
                time.ss=scan.nextInt();
                System.out.println("Получилось "+ time+" секунд!");
            }
            else if(shooz==2){
                System.out.println("Введите ваши секунды для преобразования!");
                GoodTime time = new GoodTime(false);
                time.time=scan.nextInt();
                System.out.println(time+"\nВаше время переведено!");
            }
            else if (shooz==3){
                GoodTime time1 = new GoodTime(true);
                time1.hh=2;time1.mm=3;time1.ss=5;
                GoodTime time2 = new GoodTime(false);
                time2.time=10000;
                System.out.println(time2+"\nВаши секунды переведены!");
                System.out.println(time1+"\nВаше время переведено!");
            }
            else {
                System.out.println("Неверный ввод!");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Введены неверные данные!");

        }

    }
}
