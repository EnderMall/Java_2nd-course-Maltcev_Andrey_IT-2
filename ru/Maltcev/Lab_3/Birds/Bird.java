package ru.Maltcev.Lab_3.Birds;

public abstract class Bird {
    private String name;
    public abstract void sing();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
