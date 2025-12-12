package ru.Maltcev.Lab_4.Objects;

public class Storage<T> {
    private final T inside;
    private final T alter;

    public Storage(T in,T alter) {
        this.inside = in;
        this.alter = alter;
    }

    public T get() {
        if (inside==null){
            return alter;
        }
        return inside;
    }
}
