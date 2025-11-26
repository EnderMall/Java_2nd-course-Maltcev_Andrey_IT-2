package Lab_3.Ex4;

import Lab_3.TypeCheck;

public class Ex4code {
    public void code(){
        System.out.println("Задание 3.3.5\n");
        TypeCheck check = new TypeCheck();
        Dote3d testDot= new Dote3d();
        Dote3d d1 = new Dote3d();
        Dote3d d2 = new Dote3d();
        Dote3d d3 = new Dote3d();
        d1.setX(4);d1.setY(5);d1.setZ(6);
        d2.setX(5);d2.setY(6);d2.setZ(7);
        d3.setX(6);d3.setY(7);d3.setZ(8);
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
