package ru.Maltcev.Lab_3.ExCodes;

import ru.Maltcev.Birds.Cuckoo;
import ru.Maltcev.Birds.Parrot;
import ru.Maltcev.Birds.Sparrow;
import ru.Maltcev.Birds.BirdAdapt;
import ru.Maltcev.Birds.BirdsConsert;
import ru.Maltcev.Birds.SingASong;
import ru.Maltcev.TypeCheck.TypeCheck;

import java.util.ArrayList;
import java.util.List;

public class Ex6code {
    public void code(){
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
}
