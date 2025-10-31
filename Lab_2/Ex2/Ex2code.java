package Lab_2.Ex2;
import Lab_2.Ex2.Time;
import java.util.InputMismatchException;
import java.util.Scanner;

/* #1.4 Время.	Создайте	сущность	Время,	которое	будет	описывать	текущее	время	суток	в	24-х	часовом
формате.	 Время	 описывается	 числом	 секунд,	 прошедшим	 с	 начала	 суток.	 Время	 может	 быть
приведено	к	текстовой	форме	следующего	формата:	“ЧЧ:ММ:СС”.	Например,если	время	задано	как
12000,	то	текстовая	форма	будет	“3:20:00”.	Если	общее	время	превышает	24	часа,	то	отображаться
в	текстовом	виде	должно	только	то	время,	которое	прошло	с	начала	последних	суток,	например
91800,	это	не	25:30:00,	а	1:30:00.
Необходимо	создать	и	вывести	на	экран	текстовую	форму	для	следующих	вариантов	времени:
• 10	секунд
• 10000	секунд
• 100000	секунд */

public class Ex2code {
    public boolean code(){
        System.out.println("\nХотите получить ответ на вопрос из задания #1.4?(Да/Нет)");
        Scanner scan=new Scanner(System.in);
        String res=scan.next();
        if (res.equalsIgnoreCase("да")){
            Time timer1 = new Time();
            timer1.time=10;
            System.out.println(timer1);
            Time timer2 = new Time();
            timer2.time=10000;
            System.out.println(timer2);
            Time timer3 = new Time();
            timer3.time=100000;
            System.out.println(timer3);
            return false;
        }
        else if(res.equalsIgnoreCase("нет")){
            System.out.println("Хотите перевести своё время?(Да/Нет)");
            while (true){
                res=scan.next();
                if (res.equalsIgnoreCase("да")){
                    Time custom = new Time();
                    try {
                        System.out.println("Введите своё время в секундах.");
                        custom.time=scan.nextInt();
                        System.out.println(custom);
                        return false;
                    }
                    catch (InputMismatchException e){
                        System.out.println("Введены неверные данные!");
                        return false;
                    }
                }
                else if (res.equalsIgnoreCase("нет")){
                    return false;
                }
                else {
                    System.out.println("Мне кажется, я вас не понял! Повторите пожалуйста свой выбор!");
                    System.out.println("Напишите 'Да', если хотите сами ввести число, или 'нет', если хотите выйти!");
                }
            }
        }
        return true;
    }
}
