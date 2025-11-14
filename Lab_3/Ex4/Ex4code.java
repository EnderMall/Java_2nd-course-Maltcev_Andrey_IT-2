package Lab_3.Ex4;

import Lab_3.TypeCheck;

public class Ex4code {
    public void code(){
        System.out.println("Задание 4\n");
        TypeCheck check = new TypeCheck();
        Dote3d testDot= new Dote3d();
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
