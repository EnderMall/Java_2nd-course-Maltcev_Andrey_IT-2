package ru.Maltcev.Lab_3.ExCodes;

import ru.Maltcev.Geometry.Dote3d;
import ru.Maltcev.TypeCheck.TypeCheck;

public class Ex4code {
    public void code(){
        System.out.println("Задание 3.3.5\n");
        TypeCheck check = new TypeCheck();
        Dote3d testDot= new Dote3d(0,0,0);
        Dote3d d1 = new Dote3d(5,6,7);
        Dote3d d2 = new Dote3d(6,7,8);
        Dote3d d3 = new Dote3d(7,8,9);

        System.out.println("Стандартные точки для вывода: "+d1+", "+d2+", "+d3);
        System.out.println("Создайте свою точку!");
        boolean ist=true;
        while (ist){
            System.out.println("Введите координату x.");
            testDot.setX(check.getNum());
            System.out.println("Введите координату y.");
            testDot.setY(check.getNum());
            System.out.println("Введите координату z.");
            testDot.setZ(check.getNum());
            System.out.println("\nВаши координаты: "+testDot +"!\n");
            System.out.println("Хотите ввести еще данные?(Да/Нет)");
            if (!check.getYesOrNo()){
                ist=false;
            }
        }
    }
}
