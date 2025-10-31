package Lab_2.Ex4;

import java.util.List;

public class Employees {
    public String name=null;
    public Department_list department=null;

    public List<Employees> getDepartment_list() {
        return department.emploers;
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
