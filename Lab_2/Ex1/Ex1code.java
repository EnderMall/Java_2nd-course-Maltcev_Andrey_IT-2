package Lab_2.Ex1;

import java.util.Objects;
import java.util.Scanner;
/* #1.3 Имена.
Создайте сущность Имя, которая	 описывается тремя	 параметрами:	 Фамилия,	 Личное	 имя,
Отчество.	 Имя	 может	 быть	 приведено	 к	 строковому	 виду,	 включающему	 традиционное
представление	 всех	 трех	 параметров:	 Фамилия	 Имя	 Отчество	 (например	 “Иванов	 Иван
Иванович”).	Необходимо	предусмотреть	возможность	того,	что	какой-либо	из	параметров	может
быть	не	задан,	и	в	этом	случае	он	не	учитывается	при	приведении	к	текстовому	виду.
Необходимо	создать	следующие	имена:
• Клеопатра
• Пушкин	Александр	Сергеевич
• Маяковский	Владимир
Обратите внимание, что	 при выводе	 на	 экран,	 не	 заданные параметры	 никак	 не	 участвуют	 в
 */
public class Ex1code {
    public boolean code(){
        System.out.println("Хотите получить ответ на вопрос из задания #1.3?(Да/Нет)");
        Scanner scan=new Scanner(System.in);
        String res=scan.next();
        if (res.equalsIgnoreCase("да")){
            Name cleo= new Name();
            cleo.name="Клеопатра";
            Name aspushkin= new Name();
            aspushkin.name=("Александр");
            aspushkin.surName=("Пушкин");
            aspushkin.patronymic=("Сергеевич");
            Name vladimirm= new Name();
            vladimirm.name=("Владимир");
            vladimirm.surName=("Маяковский");
            System.out.println("Вот личности приведенные в задании");
            System.out.println(cleo);
            System.out.println(aspushkin);
            System.out.println(vladimirm);
            return false;
        }
        else if(res.equalsIgnoreCase("нет")){
            System.out.println("Хотите чтобы я вывел личность предложенную вами?(Да/Нет)");
            while (true){
                res=scan.next();
                if (res.equalsIgnoreCase("да")){
                    Name custom = new Name();
                    System.out.println("Введите фамилию или null");
                    res=scan.next();
                    if (!Objects.equals(res, "null")){
                        custom.surName=res;
                    }
                    System.out.println("Введите имя");
                    res=scan.next();
                    custom.name=res;
                    System.out.println("Введите отчество или null");
                    res=scan.next();
                    if (!Objects.equals(res, "null")){
                        custom.patronymic=res;
                    }
                    System.out.println("Ваша предложенная личность!");
                    System.out.println(custom);
                    return false;
                }
                else if (res.equalsIgnoreCase("нет")){
                    return false;
                }
                else {
                    System.out.println("Мне кажется, я вас не понял! Повторите пожалуйста свой выбор!");
                    System.out.println("Напишите 'Да', если хотите сами ввести личность, или 'нет', если хотите выйти!");
                }
            }
        }
        return true;
    }
}
