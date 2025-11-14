package Lab_3.Ex1;

import Lab_3.TypeCheck;

public class Ex1code {
    public void code(){
        System.out.println("Задание 1\n");
        TypeCheck check = new TypeCheck();
        boolean ist=true;
        while (ist){
            System.out.println("Введите время с начала дня.");
            System.out.println(new DayTime(check.getNum()));
            System.out.println("Хотите ввести еще данные?(Да/Нет)");
            if (!check.getYesOrNo()){
                ist=false;
            }
        }
    }
}
