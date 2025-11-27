package ru.Maltcev.Birds;

import java.util.Random;


public class Parrot extends Bird {
    private Random random = new Random();
    private String song;
    private String memory;

    public Parrot(String memory) {
        if (memory == null || memory.trim().isEmpty()) {
            throw new IllegalArgumentException("Попугай должен запомнить текст!");
        }
        this.memory = memory.trim();
    }

    @Override
    public void sing(){
        int len = memory.length();
        int times = random.nextInt(len)+1;
        song=memory.substring(0,times);
        System.out.println(song);
    }

    @Override
    public String toString() {
        return this.getName()+" поет : "+(song != null ? song : "что он еще не пел!");
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
