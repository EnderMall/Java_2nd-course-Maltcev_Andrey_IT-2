package ru.Maltcev.Lab_3.ExCodes;

import ru.Maltcev.Geometry.Dote2d;
import ru.Maltcev.TypeCheck.TypeCheck;

public class Ex7code {
    public void code(){
        System.out.println("Задание 3.6.2\n");
        Dote2d dot1 = new Dote2d(3,5);
        Dote2d dot2 = new Dote2d(25,6);
        Dote2d dot3 = new Dote2d(7,8);
        System.out.println("Точки созданные в задании 2.4.1\n"+dot1+" "+dot2+" "+dot3);


        TypeCheck check = new TypeCheck();

        System.out.println("Введите координаты вашей точки для " +
                "сравнения её с каджой из вышеперечисленных");
        int x = check.getNum();
        int y = check.getNum();
        Dote2d your = new Dote2d(x,y);
        System.out.println("Проверка эквивалентности вашей точки с представленными ранее:\n" +
                "   - "+your+" и "+dot1+" - "+your.equals(dot1)+
                "\n   - "+your+" и "+dot2+" - "+your.equals(dot2)+
                "\n   - "+your+" и "+dot3+" - "+your.equals(dot3)


        );
    }
}
