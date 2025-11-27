package ru.Maltcev.Lab_3.Office;

import Lab_2.Ex3.Department;
import Lab_2.Ex3.Employee;

public class Departament extends Department {

    public void setBoss(Boss boss) {
        if (boss.department == this) {
            this.boss_name = boss;
        } else {
            throw new IllegalArgumentException("Руководитель должен работать в этом отделе!");
        }
    }
    public Employee getBoss() {
        return this.boss_name;
    }
}