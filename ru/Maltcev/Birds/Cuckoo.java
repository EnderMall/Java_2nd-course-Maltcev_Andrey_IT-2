package ru.Maltcev.Birds;

import java.util.Random;

public class Cuckoo extends Bird {
    private Random random = new Random();
    private String song;
    @Override
    public void sing(){
        int times = random.nextInt(10)+1;
        String full= "";
        for (int i = 0; i<times;i++){
            System.out.print("ку-ку ");
            full=full+"ку-ку ";
        }
        System.out.println();
        song=full;
    }

    @Override
    public String toString() {
        return this.getName()+" поет : "+(song != null ? song : "что он еще не пел!");
    }
}
