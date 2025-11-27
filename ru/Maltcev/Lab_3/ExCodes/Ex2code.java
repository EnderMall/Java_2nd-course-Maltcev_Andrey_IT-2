package ru.Maltcev.Lab_3.ExCodes;

import Lab_2.Ex3.Employee;
import ru.Maltcev.Office.Boss;
import ru.Maltcev.Office.Departament;


public class Ex2code {
    public void code(){
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
}
