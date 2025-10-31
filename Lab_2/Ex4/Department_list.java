package Lab_2.Ex4;

import java.util.ArrayList;
import java.util.List;

public class Department_list {
    public Employees boss_name=null;
    public String department_name=null;
    public List<Employees> emploers = new ArrayList<>();

    public void addEmployee(Employees employee) {
        if (employee != null && !emploers.contains(employee)) {
            this.emploers.add(employee);
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Отдел: ").append(department_name).append("\n");
        result.append("Начальник: ").append(boss_name != null ? boss_name.name : "нет").append("\n");
        result.append("Сотрудники: ");

        for (Employees emp : emploers) {
            result.append(emp.name).append(", ");
        }
        if (!emploers.isEmpty()) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }
}
