package ru.Maltcev.Lab_3.TypeCheck;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class LineAnalyzer {

    public void code(String s1, String s2) {
        try {

        int x = parseInt(s1);
        int y = parseInt(s2);

            double result = pow(x, y);
            System.out.println(x + " ^ " + y + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: оба параметра должны быть целыми числами");
        }
    }
}
