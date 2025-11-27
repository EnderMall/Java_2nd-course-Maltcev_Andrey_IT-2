package ru.Maltcev.Office;

import Lab_2.Ex3.Department;
import Lab_2.Ex3.Employee;

public class Boss extends Employee {
    public Boss(String name) {
        super();
        this.name = name;
        this.department = null;
    }

    public void becomeBossOf(Department department) {
        this.department = department;
        department.boss_name = this;
    }

    @Override
    public String toString() {
        return name + " начальник отдела " + department.department_name;
    }
}
