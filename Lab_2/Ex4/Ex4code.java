package Lab_2.Ex4;

import Lab_2.Ex4.Department_list;
import Lab_2.Ex3.Employee;

public class Ex4code {
    public void code(){
        System.out.println("\nОтвет на задание 3.4");
        Employees petr = new Employees();
        Employees coz= new Employees();
        Employees sidr = new Employees();
        Department_list it = new Department_list();
        petr.name="Петров";
        coz.name="Козлов";
        sidr.name="Сидоров";
        petr.department = it;
        coz.department = it;
        sidr.department = it;
        it.boss_name=coz;
        it.department_name="IT";
        it.emploers.add(petr);
        it.emploers.add(coz);
        it.emploers.add(sidr);
        System.out.println("Получим список всех в отделе IT по Петрову");
        System.out.println(petr.department);

    }
}
