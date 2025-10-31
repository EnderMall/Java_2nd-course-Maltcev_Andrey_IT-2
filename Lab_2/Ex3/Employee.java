package Lab_2.Ex3;

public class Employee {
    public String name;
    public Department department;

    public Employee() {
        name = null;
        department=null;
    }

    @Override
    public String toString() {
        if (this==department.boss_name){
            return name + " начальник отдела "+department.department_name;
        }
        else {
            return name + " работает в отделе "+department.department_name+", начальник которого "+department.boss_name.name;
        }
    }
}
