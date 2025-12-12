package ru.Maltcev.Lab_3.Main;


import Lab_2.Ex3.Department;
import Lab_2.Ex3.Employee;
import ru.Maltcev.Lab_3.BinTree.Node;
import ru.Maltcev.Lab_3.Geometry.*;
import ru.Maltcev.Lab_3.Birds.*;
import ru.Maltcev.Lab_3.Office.*;
import ru.Maltcev.Lab_3.Times.DayTime;
import ru.Maltcev.Lab_3.TypeCheck.*;
import ru.Maltcev.Lab_3.TypeCheck.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void code1(){
        System.out.println("Задание 3.1.2\n");
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
    public static void code2(){
        System.out.println("Задание 3.1.11\n");
        Employee petr = new Employee();
        Employee coz= new Employee();
        Employee sidr = new Employee();

        Departament it= new Departament();

        petr.name="Петров";
        petr.department= it;
        coz.name="Козлов";
        coz.department= it;
        sidr.name="Сидоров";
        sidr.department= it;
        it.department_name="IT";

        Boss itBoss = new Boss(coz.name);
        itBoss.becomeBossOf(it);

        System.out.println(itBoss+"\n");

        System.out.println(petr);
        System.out.println(coz);
        System.out.println(sidr+"\n");

        Boss itBoss2 = new Boss(sidr.name);
        itBoss2.becomeBossOf(it);

        System.out.println(itBoss2+"\n");

        System.out.println(petr);
        System.out.println(coz);
        System.out.println(sidr+"\n");
    }

    public static void code3(){
        System.out.println("Задание 3.2.4\n");
        TypeCheck check = new TypeCheck();
        Node tree = new Node();
        tree.add(3);tree.add(5);tree.add(4);
        tree.add(7);tree.add(1);tree.add(2);
        System.out.println("Исходное дерево из задания: " + tree);
        boolean ist=true;
        while (ist){
            System.out.println("Введите число для добавления в дерево.");
            tree.add(check.getNum());
            System.out.println("Хотите ввести еще данные?(Да/Нет)");
            if (!check.getYesOrNo()){
                ist=false;
            }
        }
        System.out.println(tree);
        System.out.println("Ваше дерево, хотите удалить какой то из элементов?(Да/Нет)");
        if (check.getYesOrNo()){
            System.out.println("Введите значение, которое хотите удалить.");
            tree.remove(check.getNum());
        }
        System.out.println("Вот и ваше дерево!");
        System.out.println(tree);
    }

    public static void code4(){
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

    public static void code5() {
        System.out.println("Задание 3.4.3\n");
        Sparrow sparrow = new Sparrow();
        Cuckoo cuckoo = new Cuckoo();
        TypeCheck check = new TypeCheck();
        System.out.println("\nКакой текст запомнил наш попугай? Введите этот текст.");
        Parrot parrot = new Parrot(check.getString());

        sparrow.setName("Воробей");
        cuckoo.setName("Кукушка");
        parrot.setName("Попугай");


        sparrow.sing();
        cuckoo.sing();
        parrot.sing();

        System.out.println("\n"+sparrow);
        System.out.println(cuckoo);
        System.out.println(parrot);


    }

    public static void code6(){
        System.out.println("Задание 3.5.2\n");
        List<SingASong> concert = new ArrayList<>();
        concert.add(new BirdAdapt(new Sparrow()));
        concert.add(new BirdAdapt(new Sparrow()));
        concert.add(new BirdAdapt(new Cuckoo()));
        concert.add(new BirdAdapt(new Cuckoo()));

        System.out.println("Вы хотите переучить попугаев на свои фразы?");
        TypeCheck check = new TypeCheck();
        boolean answ = check.getYesOrNo();
        check.getString();
        if (answ) {
            System.out.println("Что помнит первый попугай?");
            concert.add(new BirdAdapt(new Parrot(check.getString())));

            System.out.println("Что помнит второй попугай?");
            concert.add(new BirdAdapt(new Parrot(check.getString())));
        } else {
            concert.add(new BirdAdapt(new Parrot("Я помню чудное мгновение!")));
            concert.add(new BirdAdapt(new Parrot("КААР, не ждали!")));
            System.out.println("Попугаи были обучены фразам: \n   - Я помню чудное мгновение!\n   - КААР, не ждали!");
        }

        BirdsConsert start = new BirdsConsert();
        start.birdConsert(concert);



    }

    public static void code7(){
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

    public static void main(String[] args) {
        code1();
        code2();
        code3();
        code4();
        code5();
        code6();
        code7();

        System.out.println("Задание 3.7.3\n");

        LineAnalyzer line = new LineAnalyzer();
        TypeCheck check = new TypeCheck();

        System.out.println("Введите первое число, которое будет считано как строка.");

        String str1 = check.getString();
        System.out.println("Введите второе число, которое будет считано как строка.");
        String str2 = check.getString();

        line.code(str1,str2);



    }
}