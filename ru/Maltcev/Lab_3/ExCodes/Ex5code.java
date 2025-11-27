package ru.Maltcev.Lab_3.ExCodes;

import ru.Maltcev.Birds.Cuckoo;
import ru.Maltcev.Birds.Parrot;
import ru.Maltcev.Birds.Sparrow;
import ru.Maltcev.TypeCheck.TypeCheck;

public class Ex5code {
    public void code() {
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
}
