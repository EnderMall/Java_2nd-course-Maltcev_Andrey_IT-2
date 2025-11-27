package ru.Maltcev.Lab_3.Birds;

import java.util.List;

public class BirdsConsert {

    public void birdConsert(List<SingASong> singers){
        System.out.println("=== Начинается птичий концерт ===");
        for (SingASong singer: singers){
            singer.sing();
        }
        System.out.println("=== Концерт окончен ===");
    }

}
